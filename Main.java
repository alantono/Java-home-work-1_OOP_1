// Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. 
// Для каждого сформировать список свойств и возможных действий. 
// Например свойство скорость, действие нанести удар. 
// Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
// Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. 
// В основной программе создать по одному экземпляру каждого типа персонажей.
import Unit.Arbalester;
import Unit.Characters;
import Unit.Farmer;
import Unit.Monk;
import Unit.Rogue;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Wizard;

public class Main {
    public static void main(String[] args) {
        Characters characters = new Characters("", 50, 100, 50);   // обращаемся к объекту characters
        Arbalester arbalester = new Arbalester("one", 50, 100, 50);
        Arbalester arbalester2 = new Arbalester("two", 50, 100, 50);
        Farmer farmer = new Farmer("", 50, 100, 50);
        Monk monk = new Monk("", 50, 100, 50);
        Rogue rogue = new Rogue("", 50, 100, 50);
        Sniper sniper = new Sniper("", 50, 100, 50);
        Spearman spearman = new Spearman("", 50, 100, 50);
        Wizard wizard = new Wizard("", 50, 100, 50);
        
    }
}
