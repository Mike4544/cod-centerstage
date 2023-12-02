package com.example.meepmeep;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class meepmeep {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(75, 75, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(23, -61.5, Math.toRadians(90)))
                                .lineTo(new Vector2d(10, -34))
                                .strafeRight(5)
                                .back(5)
                                .turn(Math.toRadians(90))
                                .strafeRight(2)
                                .back(25)
                                .back(5)
                                .forward(85)
                                .strafeRight(1.5)
                                .strafeLeft(1.5)
                                .back(85)
                                .forward(85)
                                .strafeRight(1.5)
                                .strafeLeft(1.5)
                                .back(85)
                                .forward(85)
                                .strafeRight(1.5)
                                .strafeLeft(1.5)
                                .back(85)
                                .forward(85)
                                .strafeRight(13.5)
                                .strafeLeft(13.5)
                                .back(8)

                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}