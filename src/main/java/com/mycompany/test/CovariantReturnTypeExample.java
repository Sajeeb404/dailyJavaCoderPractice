package com.mycompany.test;
















public class CovariantReturnTypeExample {
}



class Bangldesh{

    Bangldesh bangldesh (){
      return this;
    };


}

class Dhaka extends Bangldesh{

    @Override
    Dhaka bangldesh() {
        return this;
    }

}
