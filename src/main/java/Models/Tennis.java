package Models;






public class Tennis {
	
	public Tennis(String Club, String Player1, String Player2, String Player3, String Player4, String Player5, String Player6, 
			String Player7, int Wins, int Losses, int Draws, int Played,int Points   ) {
		super();
		this.Club = Club;
		this.Player1 = Player1;
		this.Player2 = Player2;
		this.Player3 = Player3;
		this.Player4 = Player4;
		this.Player5 = Player5;
		this.Player6 = Player6;
		this.Player7 = Player7;
		this.Points = Points;
		this.Played = Played;
		this.Wins = Wins;
		this.Losses = Losses;
		this.Draws = Draws;
	}

	public Tennis() {
		super();
	}

	public Tennis(String club1name, String club2name, int club1playedNum, int club2playedNum, int club1winsadd,
			int club2winsadd, int club1lossadd, int club2lossadd, int club1drawsadd, int club2drawsadd, int HTtotalPoints, int ATtotalPoints) {
		this.club1name =club1name;
		this.club2name = club2name;
		this.club1playedNum = club1playedNum;
		this.club2playedNum = club2playedNum;
		this.club1winsadd = club1winsadd;
		this.club2winsadd = club2winsadd;
		this.club1lossadd = club1lossadd;
		this.club2lossadd = club2lossadd;
		this.club1drawsadd = club1drawsadd;
		this.club2drawsadd = club2drawsadd;
		this.HTtotalPoints = HTtotalPoints;
		this.ATtotalPoints = ATtotalPoints;
	}
	String club1name;
	String club2name;
	int club1playedNum;
	int club2playedNum;
	int club1winsadd;
	int club2winsadd;
	int club1lossadd;
	int club2lossadd;
	int club1drawsadd;
	int club2drawsadd;
	int HTtotalPoints;
	int ATtotalPoints;
	String Club;
	String Player1;
	String Player2;
	String Player3;
	String Player4;
	String Player5;
	String Player6;
	String Player7;
	int Points;
	int Played;
	int Wins;
	int Losses;
	int Draws;

	public String getClub() {
		return Club;
	}

	public void setClub(String Club) {
		this.Club = Club;
	}

	public String getPlayer1() {
		return Player1;
	}

	public void setPlayer1(String Player1) {
		this.Player1 = Player1;
	}
	public String getPlayer2() {
		return Player2;
	}

	public void setPlayer2(String Player2) {
		this.Player2 = Player2;
	}
	public String getPlayer3() {
		return Player3;
	}

	public void setPlayer3(String Player3) {
		this.Player3 = Player3;
	}
	public String getPlayer4() {
		return Player4;
	}

	public void setPlayer4(String Player4) {
		this.Player4 = Player4;
	}
	public String getPlayer5() {
		return Player5;
	}

	public void setPlayer5(String Player5) {
		this.Player5 = Player5;
	}
	public String getPlayer6() {
		return Player6;
	}

	public void setPlayer6(String Player6) {
		this.Player6 = Player6;
	}
	public String getPlayer7() {
		return Player7;
	}

	public void setPlayer7(String Player7) {
		this.Player7 = Player7;
	}

	public int getPlayed() {
		return Played;
	}

	public void setPlayed(int Played) {
		this.Played = Played;
	}
	public int getPoints() {
		return Points;
	}

	public void setPoints(int Points) {
		this.Points = Points;
	}
	public int getWins() {
		return Wins;
	}

	public void setWins(int Wins) {
		this.Wins = Wins;
	}
	public int getDraws() {
		return Draws;
	}

	public void setDraws(int Draws) {
		this.Draws = Draws;
	}
	public int getLosses() {
		return Losses;
	}

	public void setLosses(int Losses) {
		this.Losses = Losses;
	}
	
	  // Getter and setter methods for club1name
    public String getClub1name() {
        return club1name;
    }
    public void setClub1name(String club1name) {
        this.club1name = club1name;
    }

    // Getter and setter methods for club2name
    public String getClub2name() {
        return club2name;
    }
    public void setClub2name(String club2name) {
        this.club2name = club2name;
    }

    // Getter and setter methods for club1playedNum
    public int getClub1playedNum() {
        return club1playedNum;
    }
    public void setClub1playedNum(int club1playedNum) {
        this.club1playedNum = club1playedNum;
    }

    // Getter and setter methods for club2playedNum
    public int getClub2playedNum() {
        return club2playedNum;
    }
    public void setClub2playedNum(int club2playedNum) {
        this.club2playedNum = club2playedNum;
    }

    // Getter and setter methods for club1winsadd
    public int getClub1winsadd() {
        return club1winsadd;
    }
    public void setClub1winsadd(int club1winsadd) {
        this.club1winsadd = club1winsadd;
    }

    // Getter and setter methods for club2winsadd
    public int getClub2winsadd() {
        return club2winsadd;
    }
    public void setClub2winsadd(int club2winsadd) {
        this.club2winsadd = club2winsadd;
    }

    // Getter and setter methods for club1lossadd
    public int getClub1lossadd() {
        return club1lossadd;
    }
    public void setClub1lossadd(int club1lossadd) {
        this.club1lossadd = club1lossadd;
    }

    // Getter and setter methods for club2lossadd
    public int getClub2lossadd() {
        return club2lossadd;
    }
    public void setClub2lossadd(int club2lossadd) {
        this.club2lossadd = club2lossadd;
    }
 // Getter and setter methods for club1drawsadd
    public int getClub1drawsadd() {
        return club1drawsadd;
    }
    public void setClub1drawsadd(int club1drawsadd) {
        this.club1drawsadd = club1drawsadd;
    }

    // Getter and setter methods for club2ldrawsadd
    public int getClub2drawsadd() {
        return club2drawsadd;
    }
    public void setClub2drawsadd(int club2drawsadd) {
        this.club2drawsadd = club2drawsadd;
    }

    // Getter and setter methods for HTtotalPoints
    public int getHTtotalPoints() {
        return HTtotalPoints;
    }
    public void setHTtotalPoints(int HTtotalPoints) {
        this.HTtotalPoints = HTtotalPoints;
    }

    // Getter and setter methods for ATtotalPoints
    public int getATtotalPoints() {
        return ATtotalPoints;
    }
    public void setATtotalPoints(int ATtotalPoints) {
        this.ATtotalPoints = ATtotalPoints;
    }

	@Override
	public String toString() {
		return "[Club=" + Club + ", Player1=" + Player1 + ",  Player2=" + Player2 + ",  Player3=" 
	+ Player3 + ",Player4=" + Player4 + ",Player5=" + Player5 + ",  Player6=" + Player6 + ",  Player7=" + Player7 + ","
			 + ", Wins=" + Wins + ",  Losses=" + Losses + ", Played= " + Played +", Points=" + Points + ",]";
	}

}
