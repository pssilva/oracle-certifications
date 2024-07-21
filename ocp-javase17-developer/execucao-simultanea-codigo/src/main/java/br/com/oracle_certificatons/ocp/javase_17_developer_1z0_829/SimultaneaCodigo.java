package br.com.oracle_certificatons.ocp.javase_17_developer_1z0_829;

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
   * @see: <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase17-developer/execucao-simultanea-codigo#objetivos-do-exame-ocp-abordados-neste-cap%C3%ADtulo">OBJETIVOS DO EXAME OCP ABORDADOS NESTE CAPÍTULO</a>
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
   *<h4>Questões Relevantes</h4>
   * 
   *<p>Buscaresmos responder:</p>
   *<ul>
   *    <li>Como o sistema decide o que executar quando há mais threads disponíveis do que CPUs?</li>
   *    <li>Explique o motivo que devemos usar o método Thread.start() e não usar o Thread.run()?</li>
   * </ul>
   * 
  */
  public Thread criandoThread(){

    Thread meuThread = new Thread(() -> System.out.print("Hello"));
    meuThread.start();

    return meuThread;
  }


  

}
