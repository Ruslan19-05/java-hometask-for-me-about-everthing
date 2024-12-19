package az.edu.turing.ProjectFamilyApp;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother,Human father,Human[] children,Pet pet){
        this.mother=mother;
        this.father=father;
        this.children=children;
        this.pet=pet;
    }

    public Family(Human mother,Human father,Human []children){
        this.mother=mother;
        this.father=father;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child){

        Human[] newChildren=Arrays.copyOf(children,children.length+1);
        newChildren[children.length]=child;
        children=newChildren;

        child.setFamily(this);
    }

    public boolean deleteChild(int index){
        if(index<0 || index >=children.length){
            return false;
        }

        children[index].setFamily(null);

        Human[] newChild=new Human[children.length-1];
        for(int i=0,j=0;i<children.length;i++){
            if(i!=index){
                newChild[j++]=children[i];
            }
        }
        children=newChild;
        return true;
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                return deleteChild(i);
            }
        }
        return false;
    }


    public int countFamily(){
        if(children!=null){
             int count=2+children.length;
             return count;
        }
        return 2;
    }

    @Override
    public String toString() {
        return "Family{" +
                "Mother='" + mother + '\'' +
                ", Father='" + father + '\'' +
                ", Children=" + Arrays.toString(children) +
                ", Pet=" + pet +'\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Family family=(Family) o;
        return mother==family.mother && father==family.father && children==family.children && pet==family.pet;
    }

    @Override
    public int hashCode(){
        return Objects.hash(mother,father, Arrays.hashCode(children),pet);
    }
}
