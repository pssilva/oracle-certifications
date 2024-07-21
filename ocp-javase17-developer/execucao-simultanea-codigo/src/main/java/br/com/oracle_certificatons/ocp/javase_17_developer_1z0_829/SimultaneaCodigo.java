package br.com.oracle_certificatons.ocp.javase_17_developer_1z0_829;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
   * 
   * <h3>OBJETIVOS DO EXAME OCP ABORDADOS NESTE MÓDULO</h3>
   * <p align="justify">Gerenciando a Execução Simultânea (Concurrent) de Código: </p>
   *  <ul> 
   *    <li>Crie {@code Thread} de trabalho usando  {@code Runnable} e {@code Callable},</li> 
   *    <li>Gerencie o ciclo de vida do {@code Thread},</li>
   *    <li>Incluindo automações fornecidas por diferentes serviços Executor e API</li>
   *    <li>Simultânea Desenvolva código thread-safe,</li>
   *    <li>Usando diferentes mecanismos de bloqueio</li>
   *    <li>Usando API simultânea</li>
   *    <li>Processe coleções Java simultaneamente,</li>
   *    <li>Incluindo o uso de fluxos paralelos (parallel streams).</li>
   * </ul>
   * 
   * @see: <a href="https://github.com/pssilva/oracle-certifications/blob/main/ocp-javase17-developer/execucao-simultanea-codigo/README.md#gerenciando-a-execu%C3%A7%C3%A3o-simult%C3%A2nea--concorrentes-de-c%C3%B3digo">OBJETIVOS DO EXAME OCP ABORDADOS NESTE CAPÍTULO</a>
   *    
   *
   * 
  */
public class SimultaneaCodigo {


  /**
   * 
   * <h3>OBJETIVOS DO EXAME OCP ABORDADOS NESTE MÓDULO</h3>
   * <p align="justify">Gerenciando a Execução Simultânea (Concurrent) de Código: </p>
   *  <ul> 
   *    <li>Crie {@code Thread} de trabalho usando  {@code Runnable} e {@code Callable}</li>
   * </ul>
   * 
   * <hr><br /><br />
   * Procuere responder as <a href="https://github.com/pssilva/oracle-certifications/blob/main/ocp-javase17-developer/execucao-simultanea-codigo/README.md#quest%C3%B5es-relevantes">Questões Relevantes</a>
   * 
   * 
  */
  public Thread criandoThread(){

    Thread meuThread = new Thread(() -> System.out.println("Criando um Thread!"));
    meuThread.start();

    return meuThread;
  }

  public Runnable criandoThreadComRunneble(){
    Runnable meuRunnable = () -> System.out.println("Criando Thread de Trabalho usando Runnable!");
    Thread meuThread = new Thread(meuRunnable);
    meuThread.start();
    return meuRunnable;
  }

  public Callable criandoThreadComCallable() throws InterruptedException, ExecutionException {
    
    Callable meuCallable = () -> 1+1;
		var service = Executors.newSingleThreadExecutor();
    try {

      Future<Integer> result = service.submit(meuCallable);
      System.out.println("criandoThreadComCallable = " + result.get()); 
      
    } finally {
      service.shutdown();
   }

    return meuCallable;

	}


}
