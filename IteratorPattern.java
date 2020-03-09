package examples;

interface Iterator {
    public boolean hasNext();
    public Object next();
}
interface Sector {
    public Iterator getIterator();
}

class EmployeeRepository implements Sector {
    public String[] employees = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }
    
    private class EmployeeIterator implements Iterator {
        int index;
        
        @Override
        public boolean hasNext() {
            if(index < employees.length) {
                return true;
            } 
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}

public class IteratorPattern {
    public static void main(String[] args) {

        EmployeeRepository employeeRepository = new EmployeeRepository();

        for(Iterator iterator = employeeRepository.getIterator(); 
                iterator.hasNext();) {
            String employee = (String)iterator.next();
            System.out.println("Employee: " + employee);
        }
    }
}
