package com.company;
//Итак,опишем ,что здесь происходит:
//Создаём класс RecTest
public class RecTest {
    //Обозначаем поле класса массив чисел
   int values[];
   //Создаём конструктор класса с аргуметом число
   RecTest(int i){
       //В конструкторе иницализируем массив values,где число ячеек равно аргументу класса
       values=new int[i];
   }
   //Создаём  метод с аргументом число
   void printArray(int x){
       //Создаём условие выхода из метода при значении аргумента равном нолю
       if(x==0) return;
       else printArray(x-1);
       System.out.println("[" + (x-1) + "] "+ values[x-1]);
   }
}
