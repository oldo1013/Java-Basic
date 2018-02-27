/*
Упражнение 1.2
Эта программа отображает таблицу перевода галлонов в литры.
Присвойте файлу с исходным кодом имя GalToLitTaЬle.java.
*/
public class DToM {
    public static void main(String args[]) {
        double d, m;
        int counter;
        counter = 0;
        //Счетчик строк ииициаnизируется иуnевым значением
        for (d = 1; d <= 12*12; d++) {
            m = d * 39.37; // преобразовать в литры
            System.out.println(d + " дюймам соответствует " + m + " метров.");
            counter++; //Уаеnнчнвать значение счетчика строк на 1 на каждой нтерацнн цнкпа
            if (counter == 12) {
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }
    }
}
