// não refatorado

class OperarioChefe {
    /*  aqui estão atributos privates e seus respectivos getters e setters
                   ...
    */

    public void comandarFuncionario(){
        System.out.println("Comandar operarios");
    }
}

// refatorado

class OperarioChefeRefatorado implements chefe {
    /*  aqui estão atributos privates e seus respectivos getters e setters
                   ...
    */

    public void comandarFuncionario(){
        System.out.println("Comandar operarios");
    }
}

interface Chefe {
    public void comandarFuncionario();
}

