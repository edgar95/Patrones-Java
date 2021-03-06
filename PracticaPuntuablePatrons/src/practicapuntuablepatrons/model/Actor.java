/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapuntuablepatrons.model;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Actor {

    private String name;
    private int yearBirth;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public Actor(String name, int yearBirth) {
        this.name = name;
        this.yearBirth = yearBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + this.yearBirth;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        boolean b;
        if (this == object) {
            b = true; //Same object
        } else if (object instanceof Actor) { //is it an Actor?
            //Check the values of the parameters
            Actor other = (Actor) object;
            b = (this.name.equals(other.name));
        } else {
            b = false;
        }
        return b;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{Actor: ");
        sb.append("name = ");
        sb.append(name);
        sb.append("; yearBirth = ");
        sb.append(yearBirth);
        sb.append("}");
        return sb.toString();
    }
}
