449

With Java 8:

Collections.sort(al,Comparator.comparing((Person p)->p.firstName)
          .thenComparing(p->p.lastName)
          .thenComparingInt(p->p.age);)
If you have accessor methods:

Comparator.comparing(Person::getFirstName)
          .thenComparing(Person::getLastName)
          .thenComparingInt(Person::getAge);


  Arrays.sort(arr,Comparator.comparing((Job j)->j.profit).thenComparing(j->j.deadline).reversed());
