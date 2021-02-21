package DailyTheory.Object;

import java.util.Objects;

public class MemberDTO {
    public int number;
    public String name;

    public MemberDTO(){
    }

    public MemberDTO(String name, int num){
        this.name = name;
        this.number = num;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return number == memberDTO.number && name.equals(memberDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
