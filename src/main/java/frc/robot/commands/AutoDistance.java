// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.commands.DriveDistance;
import frc.robot.commands.TurnDegrees;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutoDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  /* [INFO 2A] There are many command groups. When we use sequencial command groups, one command runs
  after the previous one is done. For every command group like always, ask for all the information
  we need but don't have in the parameters, here we need the drivetrain to move. */

  public AutoDistance(Drivetrain drivetrain) {
    /* [Info 2B] Always write the addCommands(); function and inside each command
    gets called with new [NameOfCommand]([All The Parameters]); and each command is
    seperated by a , */
    addCommands(
        new DriveDistance(0.5, 10, drivetrain),
        new TurnDegrees(-0.5, 180, drivetrain),
        new DriveDistance(0.5, 10, drivetrain));
  }
}
