package br.com.oracle_certificatons.ocp.javase_17_developer_1z0_829;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;


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
   *    <li>Criando Threads Com a API de Simultaneidade</li>
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
   * Variável de Contador Compartilhada
   * 
   * E Aqui foque em responder também:
   * <ul>
   *    <li>Qual é a melhor forma de se usar variável de contador compartilhada?</li>
   *    <li>Qual é a relação do uso da variável de contador compartilhada com thread-safe?</li>
   * </ul>
   * 
   * 
  */
  private int counter = 0;

  Logger logger = Logger.getLogger(getClass().getName());

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
  */

  public Runnable criandoThreadComRunnable(){
    Runnable meuRunnable = () -> logger.info("Criando Thread de Trabalho usando Runnable!"); 
  
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
   *    <li>Qual é a diferença entre criar Thread usando as classes {@code Callable} e {@code Runnable}?</li>
   * </ul>
   * 
   * @author  Paulo Sérgio
   * @see     java.lang.Thread
   * @see     java.util.concurrent.Callable
   * @see     java.util.concurrent.Executors
   * @see     java.util.concurrent.Future
   * 
  */
  public Callable criandoThreadComCallable() throws InterruptedException, ExecutionException {
    
    Callable meuCallable = () -> 1+1;
    var service = Executors.newSingleThreadExecutor();

    try {

      Future<Integer> result = service.submit(meuCallable);
      logger.info("criandoThreadComCallable = " + result.get()); 
      
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
   *    <li>Como podemos consultar o estado de um {@code Thread}? {@code meuThread.getState()}</li>
   *    <li>Qual é a melhor forma de se usar variável de contador compartilhada?</li>
   *    <li>Qual é a relação do uso da variável de contador compartilhada com thread-safe?</li>
   *    <li>Explique a relação entre os tópidos de certificcação: Tratamento de Excesções com Execução Simultanea de Código?</li>
   * 
   * 
   * </ul>
   * 
   * @author  Paulo Sérgio
   * @see     java.lang.Thread
   * @see     java.util.concurrent.Callable
   * @see     java.util.concurrent.Executors
   * @see     java.util.concurrent.Future
   * 
  */
  public int gerencieCicloVidaThread() {
    Thread meuThread = new Thread(() -> {
      for(int i = 0; i < 1_000_000; i++) this.counter++;
    });

    //System.out.println("Etado Thread = " + meuThread.getState());
    logger.info("Etado Thread = " + meuThread.getState());
    meuThread.start();

    //System.out.println("Etado Thread = " + meuThread.getState());
    logger.info("Etado Thread = " + meuThread.getState());

    while(this.counter < 1_000_000) {
      logger.info("Ainda não alcançado");
      logger.info("Etado Thread = " + meuThread.getState());
        try {
          Thread.sleep(1_000); // 1 SECOND
          logger.info("Etado Thread = " + meuThread.getState());
        } catch (InterruptedException e) {
          logger.info("Interrompida!");
        } finally {
          meuThread=null;
       }
    }

    logger.log(Level.INFO, "Reached: {0}", this.counter);

    return counter;
  } 

  /**
   * 
   * <h3>OBJETIVOS DO EXAME OCP ABORDADOS NESTE MÓDULO</h3>
   * <p align="justify">
   * Gerenciando a Execução Simultânea (Concurrent) de Código:
   * 
   *  <ul> 
   *    <li>Gerencie o ciclo de vida do {@code Thread}</li>
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
   *    <li>Como interromper uma {@code Thread}?</li> 
   *    <li>Como pegar a instância da Main {@code Thread} (principal)?</li> 
   *    <li>O quê ocorre ao Chamar {@code Thread.interrupt()} em um thread que já está no estado {@code RUNNABLE}?</li> 
   *    <li>Explique a relação entre os tópidos de certificcação: Tratamento de Excesções com Execução Simultanea de Código?</li>
   * </ul>
   * 
   * @author  Paulo Sérgio
   * @see     java.lang.Thread
   * 
  */
  public int interronperThread() {
    
    final var mainThread = Thread.currentThread();

    Thread meuThread = new Thread(() -> {
      for(int i = 0; i < 1_000_000; i++) this.counter++;
      mainThread.interrupt();
    });

    meuThread.start();
    while(counter < 1_000_000) {
      logger.info("Ainda não alcançado");
      try {
         Thread.sleep(1_000);  // 1 SECOND
      } catch (InterruptedException e) {
         logger.info("Interrompido!");
      }
   }

   logger.log(Level.INFO, "Alcançada: {0}", this.counter);

    return this.counter;
  }

  /**
   * 
   * <h3>OBJETIVOS DO EXAME OCP ABORDADOS NESTE MÓDULO</h3>
   * <p align="justify">
   * Gerenciando a Execução Simultânea (Concurrent) de Código:
   * 
   *  <ul> 
   *    <li>Criando Threads Com a API de Simultaneidade</li>
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
   *    <li>Como interromper uma {@code Thread}?</li> 
   * </ul>
   * 
   * @author  Paulo Sérgio
   * @see     java.lang.Thread
   * @see     java.util.concurrent.Executors
   * @see     java.util.concurrent.ExecutorService
   * 
  */
  public ExecutorService criandoThreadAPISimultaneidade(){

    var service = Executors.newSingleThreadExecutor();

    Runnable mostrarInventario = () -> logger.log(Level.INFO, "Mostrando o inventário do Zoo");
    Runnable mostrarRegistro = () -> {
      for (int i = 0; i < 3; i++)
          logger.log(Level.INFO, "Mostrando Registro: {0}", i);
    };

    try {
      logger.log(Level.INFO, "início!");
      service.execute(mostrarInventario);
      service.execute(mostrarRegistro);
      service.execute(mostrarInventario);
      logger.log(Level.INFO, "Fim!");
    } finally {
      service.shutdown();
    }
    return service;
  }

}


  

