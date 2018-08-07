# todo

Static methods that throw the unchecked TodoException, intended to help rough-out code.

#### `todo` can pretend to return a value...

    ... {
        ...
        
        List<PatchFile> patches = todo("get around to reading the patch files someday");
        
        ...
    }

=>

    Exception in thread "main" net.johnglassmyer.todo.Todo$TodoException: get around to reading the patch files someday
        at net.johnglassmyer.todo.Todo.todo(Todo.java:24)
        at com.example.MyProgram.main(MyProgram.java:9)

#### ...or not

    ... {
        ...
        
        todo(); // will throw new TodoException()
        
        ...
    }
