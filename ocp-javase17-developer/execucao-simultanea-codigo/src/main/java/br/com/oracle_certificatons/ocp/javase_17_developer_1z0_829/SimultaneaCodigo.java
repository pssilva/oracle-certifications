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

  private int counter = 0;

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

  /**
   * 
   * <h3>OBJETIVOS DO EXAME OCP ABORDADOS NESTE MÓDULO</h3>
   * <p align="justify">
   * Gerenciando a Execução Simultânea (Concurrent) de Código:
   * 
   *  <ul> 
   *    <li>Crie {@code Thread} de trabalho usando  {@code Runnable} e {@code Callable}</li>
   * </ul>
   * 
   * <hr></br></br></br>
   * <p>
   * Procuere responder as <a href="https://github.com/pssilva/oracle-certifications/blob/main/ocp-javase17-developer/execucao-simultanea-codigo/README.md#quest%C3%B5es-relevantes">Questões Relevantes</a>.
   * 
   * <p>
   * E Aqui foque em responder também:
   * 
   * <ul>
   *    <li>Qual é o Cenário ou o caso de uso mais indicado para se usar {@code Runneble}?</li>
   * </ul>
   * 
   * @author  Paulo Sérgio
   * @see     java.lang.Thread
   * @see     java.util.concurrent.Runnable
   * 
   * 
  */

  public Runnable criandoThreadComRunnable(){
    Runnable meuRunnable = () -> System.out.println("Criando Thread de Trabalho usando Runnable!");
    Thread meuThread = new Thread(meuRunnable);
    meuThread.start();
    return meuRunnable;
  }

  /**
   * 
   * <h3>OBJETIVOS DO EXAME OCP ABORDADOS NESTE MÓDULO</h3>
   * <p align="justify">
   * Gerenciando a Execução Simultânea (Concurrent) de Código:
   * 
   *  <ul> 
   *    <li>Crie {@code Thread} de trabalho usando  {@code Runnable} e {@code Callable}</li>
   * </ul>
   * 
   * <hr></br></br></br>
   * <p>
   * Procuere responder as <a href="https://github.com/pssilva/oracle-certifications/blob/main/ocp-javase17-developer/execucao-simultanea-codigo/README.md#quest%C3%B5es-relevantes">Questões Relevantes</a>.
   * 
   * <p>
   * E Aqui foque em responder também:
   * 
   * <ul>
   *    <li>Qual é o Cenário ou o caso de uso mais indicado para se usar {@code Callable}?</li>
   *    <li>Qual é a relação entre as classes: {@code Callable} e {@code Executors}?</li>
   *    <li>Explique a relação entre os tópidos de certificcação: Tratamento de Excesções com Execução Simultanea de Código?</li>
   * </ul>
   * 
   * @author  Paulo Sérgio
   * @see     java.lang.Thread
   * @see     java.util.concurrent.Callable
   * @see     java.util.concurrent.Executors
   * @see     java.util.concurrent.Future
   * 
   * 
   * 
  */
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


  /**
   * 
   * <h3>OBJETIVOS DO EXAME OCP ABORDADOS NESTE MÓDULO</h3>
   * <p align="justify">
   * Gerenciando a Execução Simultânea (Concurrent) de Código:
   * 
   *  <ul> 
   *    <li> Gerencie o ciclo de vida do {@code Thread}</li>
   * </ul>
   * 
   * <hr></br></br></br>
   * <p>
   * Procuere responder as <a href="https://github.com/pssilva/oracle-certifications/blob/main/ocp-javase17-developer/execucao-simultanea-codigo/README.md#quest%C3%B5es-relevantes">Questões Relevantes</a>.
   * 
   * <p>
   * E Aqui foque em responder também:
   * 
   * <ul>
   *    <li>Quais são os Estados de uma {@code Thread}? Veja em: <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase17-developer/execucao-simultanea-codigo#ds-estados-thread">Diagrama Estados Thread</a></li>
   *    <li>Como podemos consultar o estado de um {@code Thread}?</li>
   * </ul>
   * 
   * @author  Paulo Sérgio
   * @see     java.lang.Thread
   * @see     java.util.concurrent.Callable
   * @see     java.util.concurrent.Executors
   * @see     java.util.concurrent.Future
   * 
   * 
   * 
  */
  public int gerencieCicloVidaThread() {
    Thread meuThread = new Thread(() -> {
      for(int i = 0; i < 1_000_000; i++) this.counter++;
    });

    System.out.println("Estatus Thread = " + meuThread.getState());
    meuThread.start();

    System.out.println("Estatus Thread = " + meuThread.getState());

    while(this.counter < 1_000_000) {
      System.out.println("Ainda não alcançado");
      System.out.println("Estatus Thread = " + meuThread.getState());
        try {
          Thread.sleep(1_000); // 1 SECOND
          System.out.println("Estatus Thread = " + meuThread.getState());
        } catch (InterruptedException e) {
          System.out.println("Interrompida!");
        } finally {
          meuThread=null;
       }
    }
    System.out.println("Reached: " + this.counter);

    return counter;
  } 


}
