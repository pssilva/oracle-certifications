import br.com.concurrency.Bank;
import br.com.concurrency.PlatformVsVirtual;

import java.util.HashMap;
import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 13 ■ Concorrência
 *
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE PACOTE: Concurrency
 * <ul>
 *     <li>Gerenciando a Execução Concorrente de Código</li>
 *     <ul>
 *         <li>Criar threads de plataforma e virtuais</li>
 *         <ul>
 *  *         <li>Usar objetos Runnable e Callable</li>
 *  *         <li>Gerenciar o ciclo de vida da thread</li>
 *  *         <li>Usar diferentes serviços Executor e a API concorrente para executar tarefas</li>
 *         </ul>
 *         <li>Desenvolver código thread-safe</li>
 *         <ul>
 *  *         <li>usando mecanismos de bloqueio e a API concorrente</li>
 *         </ul>
 *         <li>Processar coleções Java concorrentemente e utilizar fluxos paralelos</li>
 *     </ul>
 *     <li>Trabalhando com Streams e Expressões Lambda</li>
 *     <ul>
 *          <li>
 *             Realizar decomposição, concatenação, redução, agrupamento e
 *             particionamento em fluxos sequenciais e paralelos.
 *           </li>
 *     </ul>
 * </ul>
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/blob/main/docs/topicos-certificacoes/ocp-javase25-developer/concurrency/README.md#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class ConcurrencyPracticalClass {

    public ConcurrencyPracticalClass() {
    }

    public static void main(String[] args) throws InterruptedException {

        Bank bank = new Bank();

        //prioridadeThread();
        //formasCriarThread();
        //formasCriarThreadMaisComplexo();
        //gerenciandoCicloVidaThread();
        //executorServiceNewSingleThreadExecutor();
        //scheduledExecutorService();
        //entendendoErrosConsistenciaMemoria();
        entendendoSemErrosConsistenciaMemoria();

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Introdução a Threads
     * <p> » » » Entendendo a Concorrência de Threads
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void prioridadeThread() {
        var thread1 = new Thread(() -> System.out.println("Super Important"));
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        var thread2 = new Thread(() -> System.out.println("Less Important"));
        thread2.start();
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Criando uma Thread
     * <p> » » » TABELA 13.1 Criando e iniciando uma Thread
     * </ br>
     *
     * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void formasCriarThread() {
        Runnable runnable = () -> System.out.println("Hello");

        Thread thread = new Thread(runnable);
        thread.start();

        runnable = () -> System.out.println("Hello ofPlatform");
        var ofPlatform = Thread.ofPlatform();
        Thread threadOfPlatform = ofPlatform.start(runnable);

        runnable = () -> System.out.println("Hello ofVirtual");
        var ofVirtual = Thread.ofVirtual();
        Thread threaOfVirtual = ofVirtual.start(runnable);

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Introdução a Threads
     * <p> » » » Criando uma Thread
     * <p> » » » » Adiando a Tarefa
     * </ br>
     *
     * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void formasCriarThreadMaisComplexo()  throws InterruptedException {
        Runnable printInventory =
                () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        System.out.println("begin");
        var platformThread = Thread.ofPlatform()
                .priority(10)
                .start(printInventory);
        var virtualThread = Thread.ofVirtual()
                .start(printRecords);
        var constructorThread = new Thread(printInventory);
        constructorThread.start();
        System.out.println("end");
        platformThread.join();
        virtualThread.join();
        constructorThread.join();

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Introdução a Threads
     * <p> » » » Gerenciando o Ciclo de Vida de uma Thread
     * </ br>
     *
     * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void gerenciandoCicloVidaThread()  throws InterruptedException {
        threadSemVerificacao();
        threadComVerificacao();
    }

    /**
     *
     *
     */
    private static void threadSemVerificacao() {
        var thread = Thread.ofPlatform().start(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        });
        thread.interrupt();
    }

    /**
     *
     *
     */
    private static void threadComVerificacao() {
        var thread = Thread.ofPlatform().start(() -> {
            if(Thread.interrupted())
                System.out.println("Someone interrupted us!");
        });
        thread.interrupt();
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Criando Threads com a API de Concorrência
     * <p> » » » Apresentando o Executor de Thread Única
     * </ br>
     *
     * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void executorServiceNewSingleThreadExecutor() {
        Runnable printInventory =
                () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Criando Threads com a API de Concorrência
     * <p> » » » Agendando Tarefas
     * </ br>
     *
     * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void scheduledExecutorService() {
        try (var service = Executors.newSingleThreadScheduledExecutor()) {
            Runnable task1 = () -> System.out.println("Hello Zoo");
            Callable<String> task2 = () -> "Monkey";
            ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
            ScheduledFuture<?> r2 = service.schedule(task2, 8,  TimeUnit.MINUTES);

        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Escrevendo Código Thread-Safe
     * <p> » » » Entendendo Erros de Consistência de Memória
     * </ br>
     *
     * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void entendendoErrosConsistenciaMemoria() {
        var foodData = new HashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key);
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Escrevendo Código Thread-Safe
     * <p> » » » Entendendo Erros de Consistência de Memória
     * </ br>
     *
     * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void entendendoSemErrosConsistenciaMemoria() {
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key);
    }


    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 13 ■ Concorrência
     * <p> » » Escrevendo Código Thread-Safe
     * <p> » » » Trabalhando com Classes Concorrentes
     * </ br>
     *
     * <p>Escute o áudio explicativo com os conceitos envolvidos na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     *
     */
    private static void trabalhandoComClassesConcorrentes() {
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key);
    }
}
