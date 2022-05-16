package br.com.natan.tarefas.jpa;

  // imports omitidos

  public class GeraTabelas {

      public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.
              createEntityManagerFactory("tarefas");

        factory.close();
      }
  }