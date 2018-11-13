/* Built-In Functional Interfaces
*
* Functional Interfaces     # Parameters      Return Type     Single Abstract Method
* Supplier<T>                    0                T           get
* Consumer<T>                    1 (T)            void        accept
* BiConsumer<T, U>               2 (T, U)         void        accept
* Predicate<T>                   1 (T)            boolean     test
* BiPredicate<T, U>              2 (T, U)         boolean     test
* Function<T, R>                 1 (T, R)         R           apply
* BiFunction<T, U, R>            2 (T, U)         R           apply
* UnaryOperator<T>               1 (T)            T           apply
* BinaryOperator<T, T>           2 (T, T)         T           apply
*/
