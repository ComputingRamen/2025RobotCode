// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.commands;

// import edu.wpi.first.math.geometry.Pose2d;
// import edu.wpi.first.math.geometry.Rotation3d;
// import edu.wpi.first.math.geometry.Transform3d;
// import edu.wpi.first.wpilibj2.command.Command;
// import frc.robot.Constants.VisionConstants;
// import frc.robot.subsystems.Swerve;
// import org.photonvision.PhotonCamera;
// import org.photonvision.targeting.PhotonTrackedTarget;

// /* You should consider using the more terse Command factories API instead
// https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
// public class LeftCoralAlign extends Command {
//   private PhotonCamera camera;
//   Swerve swerve;

//   /** Creates a new LeftCoralAlign. */
//   public LeftCoralAlign() {
//     camera = new PhotonCamera(VisionConstants.kCameraName);
//     swerve = new Swerve(null, null);
//     // Use addRequirements() here to declare subsystem dependencies.
//   }

//   private void findPosition() {
//     var targets = camera.getLatestResult();
//     PhotonTrackedTarget bestTarget;
//     if (targets.hasTargets()) {
//       bestTarget = targets.getBestTarget();
//     } else {
//       return;
//     }
//     // int id = bestTarget.getFiducialId();
//     // double rotationInDegrees = dict.get(id);
//     Transform3d robotToTarget = bestTarget.getBestCameraToTarget();
//     Rotation3d apriltag = robotToTarget.getRotation();

//     bestTarget.getYaw();

//     Pose2d currentPose = swerve.getPose();

//     // ok this is here so i can remember for later - use the pose and determine how far away the
//     // wanted left side is away from it and just subtract the x and y and wtv and yeah

//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {}

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {}

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {}

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
