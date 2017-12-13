public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer kevin = new BaseballPlayer("Kevin");
        SoccerPlayer lin = new SoccerPlayer("Lin");

        Team<FootballPlayer> net = new Team<>("Net");
        net.addPlayer(joe);

        System.out.println(net.numPlayers());

        Team<BaseballPlayer> hat = new Team<>("Hat");
        hat.addPlayer(kevin);

        Team<SoccerPlayer> heat = new Team<>("Heat");
        heat.addPlayer(lin);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(net, 3, 10);

        net.matchResult(fremantle, 2, 5);
        net.matchResult(hawthorn,4 , 2);




    }

}
