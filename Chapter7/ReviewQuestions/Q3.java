/* Q3: Which lines need to be changed to make the code compile? (Choose all that apply.) 
*
*
ExecutorService service = Executors.newSingleThreadScheduledExecutor();
service.scheduleWithFixedDelay(() -> {    // w1
    System.out.println("Open Zoo");
    return null;  // w2   
}, 0, 1, TimeUnit.MINUTES);

Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
System.out.println(result.get());

* B. Line w1
* C. Line w2
*/