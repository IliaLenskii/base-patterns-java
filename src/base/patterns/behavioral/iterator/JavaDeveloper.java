
package base.patterns.behavioral.iterator;

public class JavaDeveloper implements ICollection {

    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    @Override
    public IIterator getIterator() {

        return new SkillIterator();
    }
    
    private class SkillIterator implements IIterator {
        
        int index;

        @Override
        public boolean hasNext() {
            
            return index < skills.length;
        }

        @Override
        public Object next() {
            
            return skills[ index++ ];
        }
    }
}
