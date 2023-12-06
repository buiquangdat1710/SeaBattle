# Sea Battle

Sea Battle is a game for two players. The game is played on four grids, two for each player. The grids are typically square – usually 10×10 – and the individual squares in the grid are identified by letter and number. On one grid the player arranges ships and records the shots by the opponent. On the other grid the player records their own shots.

The project was done by [Bùi Quang Đạt](https://github.com/naa-ntu), in the course of Object Oriented Programming at [ProPTIT](https://proptit.com/).


## Tech Stack

- [Java](https://www.java.com/en/) 


## Software Design (UML)

### Class Diagram:
![Alt text](ClassDiagram.png)

### Activity Diagram: Updating

## Demo Video
### **Gameplay video:** https://www.youtube.com/watch?v=XA_Yw9Kg0U8&list=LL&index=1&t=23s

## Demo Image
![Alt text](Demo1.png)
![Alt text](Demo2.png)
![Alt text](Demo3.png)
![Alt text](Demo4.png)

## Features

- Player can play with computer
- Player can play with another player
- Player can choose game mode
- Computer can play with another player
- Players can buy items from the weapon shop and special skill shop
- The Computer has 3 modes: Easy, Hard, Impossible.
- Users can edit background music and weather sounds.
- Computers in all modes can use money to buy items at the weapon shop and special skill shop
## Installation

- Clone the repo
- Open folder SeaBattle -> open run.bat (Batch file)
- Run the project


## Usage

- Project Structure

```bash

├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   │   ├── GameController.java
│   │   │   │   ├── GameMode.java
│   │   │   │   ├── GameStatus.java
│   │   │   │   ├── Player.java
│   │   │   │   ├── Ship.java
│   │   │   │   ├── ShipType.java
│   │   │   │   └── Square.java
│   │   │   ├── model
│   │   │   │   ├── Board.java
│   │   │   │   ├── Cell.java
│   │   │   │   ├── Game.java
│   │   │   │   ├── GameBoard.java
│   │   │   │   ├── GameCell.java
│   │   │   │   ├── GamePlayer.java
│   │   │   │   ├── GameShip.java
│   │   │   │   ├── GameSquare.java


```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
