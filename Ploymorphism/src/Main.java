class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats people";
    }
}

class IndependceDay extends Movie  {
    public IndependceDay() {
        super("IndependceDay");
    }
    @Override
    public String plot() {
        return "Alien attempt earth";
    }
}

class HarryPotter extends Movie {
    public HarryPotter() {
        super("HarryPotter");
    }
    @Override
    public String plot() {
        return "Magic movies";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }
    @Override
    public String plot() {
        return "StarWars! StarWars! StarWars!";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No Plot
}


public class Main {
    public static void main(String[] args){
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() +
                                "Plot: " + movie.plot()
            );
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("Random number is: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependceDay();
            case 3:
                return new HarryPotter();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
