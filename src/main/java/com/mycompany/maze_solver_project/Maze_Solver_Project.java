/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maze_solver_project;

import GUI_MAZE_SOLVER.AppFrame;

/**
 *
 * @author KHANGAR SIR
 */
public class Maze_Solver_Project {

    public static void main(String[] args) 
    {
        int[][]maze={
            {1,1,1,1,1,1},
            {1,0,0,0,0,1},
            {1,1,0,0,0,1},
            {1,1,0,0,9,1},
            {1,1,1,1,1,1}
                };
                 AppFrame frame=new AppFrame(maze);
                 frame.setVisible(true);
    }
}
