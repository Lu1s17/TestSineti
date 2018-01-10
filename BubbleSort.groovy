def bubbleSort ={ list ->

    indexes = 1..<list.size()
    boolean changed = false
    int aux

    while(true){

        changed = false

        indexes.each { index->
            if(list[index-1]>list[index]){
                aux = list[index]
                list[index]= list[index-1]
                list[index-1]= aux
                changed=true
            }
        }

        if(!changed)break

    }

    list
 
}
 print bubbleSort([8,455,8,6,9,45,2,3,1,11,44,6])