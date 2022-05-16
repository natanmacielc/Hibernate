
public class EntityManager {
	
	Tarefa tarefa = new Tarefa();
	  tarefa.setDescricao("Estudar JPA");
	  tarefa.setFinalizado(true);
	  tarefa.setDataFinalizacao(Calendar.getInstance());

	  EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
	  EntityManager manager = factory.createEntityManager();

	  manager.getTransaction().begin();     
	  manager.persist(tarefa);
	  manager.getTransaction().commit();

	  System.out.println("ID da tarefa: " + tarefa.getId());

	  manager.close();

}
