package hr.etfos.blazevic.josip.fitnessworkouts;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class DatabaseInitializer
{
    public static void populateAsync(@NonNull final AppDatabase database, IDatabaseChecker listener)
    {
        PopulateDbAsync task = new PopulateDbAsync(database, listener);
        task.execute();
    }

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void>
    {

        private final AppDatabase database;
        private final IDatabaseChecker listener;

        PopulateDbAsync(AppDatabase database, IDatabaseChecker context)
        {
            this.database = database;
            this.listener = context;
        }

        @Override
        protected Void doInBackground(final Void... params)
        {
            populateWithData(database);
            return null;
        }

        private static void populateWithData(AppDatabase database)
        {
            List<String> exerciseUrls = new ArrayList<>();
            List<ExerciseData> exercises = new ArrayList<>();
            ExerciseData exercise;
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/f/f7/Bench-press-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Bench-press-1.png/578px-Bench-press-1.png");
            exercise = new ExerciseData("Barbell Bench Press", "The primary muscles that are worked in a bench press are the triceps brachii and pectoralis major with the anterior (front) deltoids, traps &amp; back as secondary muscles used in the flat barbell bench press.\n\nLie back on a flat bench. Using a medium width grip (a grip that creates a 90-degree angle in the middle of the movement between the forearms and the upper arms), lift the bar from the rack and hold it straight over you with your arms locked. This will be your starting position.\nFrom the starting position, breathe in and begin coming down slowly until the bar touches your middle chest.\nAfter a brief pause, push the bar back to the starting position as you breathe out. Focus on pushing the bar using your chest muscles. Lock your arms and squeeze your chest in the contracted position at the top of the motion, hold for a second and then start coming down slowly again. Tip: Ideally, lowering the weight should take about twice as long as raising it.\nRepeat the movement for the prescribed amount of repetitions.\nWhen you are done, place the bar back in the rack.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/b/bb/Decline-dumbbell-bench-press-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Decline_dumbbell_bench_press_2.svg/512px-Decline_dumbbell_bench_press_2.svg.png");
            exercise = new ExerciseData("Flat Bench Dumbbell Press", "The main benefit of dumbbell presses, as opposed to barbell presses, is using dumbbells in this manner also allows for a greater stretch at the bottom and more efficient peak contraction at the top than a barbell press do.\nThey say that it is an advantage or benefit, well, that depends on who you are talking to and how far one goes down with the dumbbells. Also, a different item to note is that at the point of contraction, you can add a slight twist by turning your palms inward at the top, providing for a better contraction. You are not able to do that with barbell presses.\n\nLie down on a flat bench with a dumbbell in each hand resting on top of your thighs. The palms of your hands will be facing each other.\nThen, using your thighs to help raise the dumbbells up, lift the dumbbells one at a time so that you can hold them in front of you at shoulder width.\nOnce at shoulder width, rotate your wrists forward so that the palms of your hands are facing away from you. The dumbbells should be just to the sides of your chest, with your upper arm and forearm creating a 90 degree angle. Be sure to maintain full control of the dumbbells at all times. This will be your starting position.\nThen, as you breathe out, use your chest to push the dumbbells up. Lock your arms at the top of the lift and squeeze your chest, hold for a second and then begin coming down slowly. Tip: Ideally, lowering the weight should take about twice as long as raising it.\nRepeat the movement for the prescribed amount of repetitions of your training program.\n\nAnother variation of this exercise is to perform it with the palms of the hands facing each other.\nAlso, you can perform the exercise with the palms facing each other and then twisting the wrist as you lift the dumbbells so that at the top of the movement the palms are facing away from the body.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/8/86/Incline-bench-press-1.png");
            exerciseUrls.add("https://media.defense.gov/2014/Dec/16/2000980121/-1/-1/0/141211-F-YX485-035.JPG");
            exercise = new ExerciseData("Incline Barbell Bench Press", "This develops the mass and strength of the pectoral muscles (upper and middle regions) and front deltoids. The incline angle of this press hits the upper pecs really hard. The main benefit in doing incline presses is to develop the upper portion of the pectoral muscles.\n\nLoad the bar to an appropriate weight for your training.\nLay on the bench with your feet flat on the ground, driving through to your hips. Your back should be arched, and your shoulder blades retracted.\nTake a medium, pronated grip covering the rings on the bar. Remove the bar from the rack, holding the weight above your chest with your arms extended. This will be your starting position.\nLower the bar to the sternum by flexing the elbows. Maintain control and do not bounce the bar off of your chest. Your lats should stay tight and elbows slightly drawn in.\nAfter touching your torso with the bar, extend the elbows to return the bar to the starting position.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/6/6e/Dumbbell-incline-bench-press-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/9/9a/Incline-flys-with-a-twist-1.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/5/5c/Hammer-grip-incline-bench-press-1.png");
            exercise = new ExerciseData("Incline Dumbbell Bench Press", "For even crazier pumps with this exercise, try to slowly rotate the dumbbells from palms-forward to a palms-inward position during the concentric portion of the lift, really squeezing at the top. This slight change will cause you to medially rotate the upper arm, really recruiting your pec major.\n\nLie back on an incline bench with a dumbbell in each hand atop your thighs. The palms of your hands will be facing each other.\nThen, using your thighs to help push the dumbbells up, lift the dumbbells one at a time so that you can hold them at shoulder width.\nOnce you have the dumbbells raised to shoulder width, rotate your wrists forward so that the palms of your hands are facing away from you. This will be your starting position.\nBe sure to keep full control of the dumbbells at all times. Then breathe out and push the dumbbells up with your chest.\nLock your arms at the top, hold for a second, and then start slowly lowering the weight. Tip Ideally, lowering the weights should take about twice as long as raising them.\nRepeat the movement for the prescribed amount of repetitions.\nWhen you are done, place the dumbbells back on your thighs and then on the floor. This is the safest manner to release the dumbbells.\n\nAnother variation of this exercise is to perform it with the palms of the hands facing each other.\nAlso, you can perform the exercise with the palms facing each other and then twisting the wrist as you lift the dumbbells so that at the top of the movement the palms are facing away from the body.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/de/Flat-bench-cable-flys-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/6/6f/Incline-cable-flyes-1.png");
            exercise = new ExerciseData("Incline Bench Cable Fly", "Do incline cable flyes at the end of your workout for slightly higher reps (sets of 10 - 12).\n\n To get yourself into the starting position, set the pulleys at the floor level (lowest level possible on the machine that is below your torso).\nPlace an incline bench (set at 45 degrees) in between the pulleys, select a weight on each one and grab a pulley on each hand.\nWith a handle on each hand, lie on the incline bench and bring your hands together at arms length in front of your face. This will be your starting position.\nWith a slight bend of your elbows (in order to prevent stress at the biceps tendon), lower your arms out at both sides in a wide arc until you feel a stretch on your chest. Breathe in as you perform this portion of the movement. Tip: Keep in mind that throughout the movement, the arms should remain stationary. The movement should only occur at the shoulder joint.\nReturn your arms back to the starting position as you squeeze your chest muscles and exhale. Hold the contracted position for a second. Tip: Make sure to use the same arc of motion used to lower the weights.\nRepeat the movement for the prescribed amount of repetitions.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/9/94/Bench-press-2-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/6/6d/Decline-chest-press-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/d7/US_Army_50994_The_Edge%2C_Kids_learn_to_Excel%2C_Develop%2C_Grow_and_Experience_during_%27out-of-school%27_program.jpg");
            exercise = new ExerciseData("Seated Machine Chest Press", "Electromyography(EMG) research demonstrates that the machine bench press recruits much less of the three heads of the deltoid (anterior, middle, and posterior) than free-weight variations because of a decreased need for humeral stabilization. This allows you to really target your pecs.\n\nSit down on the Chest Press Machine and select the weight.\nStep on the lever provided by the machine since it will help you to bring the handles forward so that you can grab the handles and fully extend the arms.\nGrab the handles with a palms-down grip and lift your elbows so that your upper arms are parallel to the floor to the sides of your torso. Tip: Your forearms will be pointing forward since you are grabbing the handles. Once you bring the handles forward and extend the arms you will be at the starting position.\nNow bring the handles back towards you as you breathe in.\nPush the handles away from you as you flex your pecs and you breathe out. Hold the contraction for a second before going back to the starting position.\nRepeat for the recommended amount of reps.\nWhen finished step on the lever again and slowly get the handles back to their original place.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Chest_dips_1.svg/2000px-Chest_dips_1.svg.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Chest_dips_2.svg/2000px-Chest_dips_2.svg.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Dips.png/659px-Dips.png");
            exerciseUrls.add("https://c1.staticflickr.com/3/2805/33628644191_3b48db141f_b.jpg");
            exercise = new ExerciseData("Chest Dips", "To put the focus on your chest during dips, start by using bars that place your hands outside of shoulder width. If you have access to bars that are wide on one end and narrow on the other, use the wide end for chest work. Many assisted-dip stations have narrow and wide settings in which the ends of the bars can be flipped for a closer or wider grip. Still, some dip stations have only one fixed setting, so just try and find one that's relatively wide.\nOnce you\'re up on the bars with arms extended,bend your knees and push your legs back as far as possible. This turns your torso more horizontal, which places greater emphasis on your chest.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://oskarfaarkrog.com/wp-content/uploads/2017/08/InclineDumbbellPullover.jpg");
            exerciseUrls.add("https://spotmebro.com/wp-content/uploads/2017/04/dumbell-pulls-758x474.jpg");
            exerciseUrls.add("https://spotmebro.com/wp-content/uploads/2017/04/dumbbell-pullover-608x405.jpg");
            exercise = new ExerciseData("Incline Dumbbell Pull-Over", "Most chest exercises fall into one of two categories: They involve pressing a weight (bending and extending at the elbows) or doing a flye motion (keeping your elbows fixed and closing and opening your arms in front of your body). The pullover is one of a scant few options that work the chest at a completely different angle, in a top-to-bottom contraction.\n\nLie on a bench with your upper back, head and neck supported and your feet flat on the floor. Hold a dumbbell with your arms extended above your face. Maintaining just a slight bend in your elbow throughout, slowly lower the dumbbell backward, allowing your elbows to come to a point at which they align with your ears. When you’ve stretched as far as you can without bending your elbows, flex through your chest and lats to reverse direction to bring the dumbbell back overhead.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/8/87/Butterfly-machine-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/7/7e/Butterfly-machine-1.png");
            exercise = new ExerciseData("Pec-Deck Machine", "Chest flyes are hard for many trainees to learn with dumbbells or cables because the arms need to be locked in a slightly bent position for the duration of the exercise. Luckily, the pec deck simplifies things because it allows you to work in only one pathway. So, this exercise is a great movement teacher, and you can go for a great pump without having to balance any weights.\n\nElectromyography(EMG) data shows that activation of the pectoralis major and anterior delt are statistically similar between the pec deck and bench press, which means that even though you'll probably be working in different rep ranges for each exercise, you'll get great chest activation from this machine.\n\nSit on the machine with your back flat on the pad.\nTake hold of the handles. Tip: Your upper arms should be positioned parallel to the floor; adjust the machine accordingly. This will be your starting position.\nPush the handles together slowly as you squeeze your chest in the middle. Breathe out during this part of the motion and hold the contraction for a second.\nReturn back to the starting position slowly as you inhale until your chest muscles are fully stretched.\nRepeat for the recommended amount of repetitions.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            database.MuscleGroupModel().insertMuscleGroup(new MuscleGroupData(1, "Chest", exercises));

            //-------------------------------------------------------------------------------------------------

            exerciseUrls = new ArrayList<>();
            exercises = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/4/49/Deadlift_at_the_2016_World_Championships_in_Moscow%2C_Russia.jpg");
            exerciseUrls.add("https://cdn.pixabay.com/photo/2017/02/10/11/22/deadlift-2054919_960_720.jpg");
            exerciseUrls.add("https://media.defense.gov/2016/Jul/25/2001581303/825/780/0/160714-M-PS017-022A.JPG");
            exerciseUrls.add("https://media.defense.gov/2016/Mar/24/2001506271/780/780/0/160321-F-DE377-006.jpg");
            exercise = new ExerciseData("Barbell Deadlift", "This is technically more than a back exercise—it hits the entire posterior chain from your calves to your upper traps—but it's the absolute best for overall backside development. Technique is uber-important with the deadlift, but once you nail it, you can progress to lifting monster weights that will recruit maximum muscle, release muscle-building hormones, and help you get big.\n\nApproach the bar so that it is centered over your feet. Your feet should be about hip-width apart. Bend at the hip to grip the bar at shoulder-width allowing your shoulder blades to protract. Typically, you would use an alternating grip.\nWith your feet and your grip set, take a big breath and then lower your hips and flex the knees until your shins contact the bar. Look forward with your head. Keep your chest up and your back arched, and begin driving through the heels to move the weight upward.\nAfter the bar passes the knees aggressively pull the bar back, pulling your shoulder blades together as you drive your hips forward into the bar.\nLower the bar by bending at the hips and guiding it to the floor.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Wide_grip_chin_up_1.svg/500px-Wide_grip_chin_up_1.svg.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Wide_grip_chin_up_2.svg/598px-Wide_grip_chin_up_2.svg.png");
            exerciseUrls.add("https://media.defense.gov/2013/Jan/09/2000085364/780/780/0/130108-F-HK400-019.JPG");
            exerciseUrls.add("https://media.defense.gov/2018/Aug/13/2001953415/780/780/0/180809-F-HW934-013.JPG");
            exercise = new ExerciseData("Wide-Grip Pull-Up", "It's always a good idea to have an overhead pulling movement in your back routine, and the pull-up is one of the best. Wide-grip pull-ups are excellent for putting emphasis on the upper lats. A closer grip may allow for a longer range of motion, but it may be possible to load the wide-grip pull-up to a greater degree because of an optimized starting joint position. The biggest challenge here for most trainers is training to failure in the right rep range for growth, which is 8-12.\n\nIf you do pull-ups early in your workout, you might have to add a weighted belt. Of course, if you find them difficult, you can always use an assisted pull-up machine or a good spotter, or switch to the wide-grip pull-down, which is a solid substitute. If your shoulders are healthy, pulling behind the head is okay.\n\nGood form is extremely important here. In the starting position, the scapula should be retracted—pull your shoulder blades down and toward each other—prior to initiating the pull.\n\nTake a wide grip on a pull-up bar, hanging freely with your arms extended. This will be your starting position.\nPull yourself up by flexing the elbows and adducting the glenohumeral joint. Do not swing or use momentum to complete the movement. Attempt to get your chin above your hands.\nPause at the top of the motion before lowering yourself to the starting position.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/dd/T-bar-row-1.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/e/eb/T-bar-row-2.png");
            exercise = new ExerciseData("Standing T-Bar Row", "Your legs need to be locked in a bent angle throughout.\nYou also typically have a choice of hand positions and width. A wider grip will put more emphasis on the lats, while a neutral grip will better target the middle back (rhomboids, teres, and traps). This exercise is probably one of the easier rows to spot.\n\nLoad the bar to an appropriate weight for your training. Stand astride the bar and bend at the hips to take a pronated grip on the handles.\nEnsure that your back remains flat, and then remove the weight from the rests, letting the bar hang at arms length. This will be your starting position.\nPerform the movement by flexing the elbows and retracting the shoulder blades, pulling the weight to your chest.\nAfter a brief pause at the top of the motion, return to the starting position.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/4/4d/Cable-seated-rows-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/2/2d/Cable-seated-rows-1.png");
            exercise = new ExerciseData("Seated Cable Row", "For this exercise you will need access to a low pulley row machine with a V-bar. The V-bar will enable you to have a neutral grip where the palms of your hands face each other. To get into the starting position, first sit down on the machine and place your feet on the front platform or crossbar provided making sure that your knees are slightly bent and not locked.\nLean over as you keep the natural alignment of your back and grab the V-bar handles.\nWith your arms extended pull back until your torso is at a 90-degree angle from your legs. Your back should be slightly arched and your chest should be sticking out. You should be feeling a nice stretch on your lats as you hold the bar in front of you. This is the starting position of the exercise.\nKeeping the torso stationary, pull the handles back towards your torso while keeping the arms close to it until you touch the abdominals. Breathe out as you perform that movement. At that point you should be squeezing your back muscles hard. Hold that contraction for a second and slowly go back to the original position while breathing in.\nRepeat for the recommended amount of repetitions.\n\nAvoid swinging your torso back and forth as you can cause lower back injury by doing so.\n\nYou can use a straight bar instead of a V-Bar and perform with a pronated grip (palms facing down-forward) or a supinated grip (palms facing up-reverse grip).", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/2/29/Close-grip-front-lat-pull-down-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/7/7d/Close-grip-front-lat-pull-down-1.png");
            exerciseUrls.add("https://bodybuilding-wizard.com/wp-content/uploads/2014/12/reverse-grip-lat-pulldown.jpg");
            exerciseUrls.add("http://www.fitnessexpertawards.com/wp-content/uploads/2018/05/Close-Grip-Lat-Pulldown-V-Bar.jpg");
            exercise = new ExerciseData("Close Grip Pulldown", "Closer grip does allow for a longer range of motion and increased time under tension for the lats, which is great for building muscle.\n\nSit down on a pull-down machine with a wide bar attached to the top pulley. Make sure that you adjust the knee pad of the machine to fit your height. These pads will prevent your body from being raised by the resistance attached to the bar.\nGrab the bar with the palms facing forward using the prescribed grip. Note on grips: For a wide grip, your hands need to be spaced out at a distance wider than your shoulder width. For a medium grip, your hands need to be spaced out at a distance equal to your shoulder width and for a close grip at a distance smaller than your shoulder width.\nAs you have both arms extended in front of you - while holding the bar at the chosen grip width - bring your torso back around 30 degrees or so while creating a curvature on your lower back and sticking your chest out. This is your starting position.\nAs you breathe out, bring the bar down until it touches your upper chest by drawing the shoulders and the upper arms down and back. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. The upper torso should remain stationary (only the arms should move). The forearms should do no other work except for holding the bar; therefore do not try to pull the bar down using the forearms.\nAfter a second in the contracted position, while squeezing your shoulder blades together, slowly raise the bar back to the starting position when your arms are fully extended and the lats are fully stretched. Inhale during this portion of the movement.\nRepeat this motion for the prescribed amount of repetitions.\n\nThe behind-the-neck variation is not recommended as it can be hard on the rotator cuff due to the hyperextension created by bringing the bar behind the neck.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/9/92/Rear-deltoid-row-2.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/a/a9/Rear-deltoid-row-1.png");
            exerciseUrls.add("https://media.defense.gov/2013/Jan/14/2000084361/-1/-1/0/130110-F-XM103-009.JPG");
            exercise = new ExerciseData("Single-Arm Dumbbell Row", "This is a great unilateral exercise—each side works independently—that allows you to move a lot of weight. You'll get greater range of motion when training unilaterally, and you won't be restrained if your weaker side fails first. You may also be better able to support your lower back—which may have taken plenty of punishment by now—when placing one hand on a bench. Allowing a slight degree of rotation of the trunk may engage a greater degree of \"core\" musculature, as well.\n\nChoose a flat bench and place a dumbbell on each side of it.\nPlace the right leg on top of the end of the bench, bend your torso forward from the waist until your upper body is parallel to the floor, and place your right hand on the other end of the bench for support.\nUse the left hand to pick up the dumbbell on the floor and hold the weight while keeping your lower back straight. The palm of the hand should be facing your torso. This will be your starting position.\nPull the resistance straight up to the side of your chest, keeping your upper arm close to your side and keeping the torso stationary. Breathe out as you perform this step. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. Also, make sure that the force is performed with the back muscles and not the arms. Finally, the upper torso should remain stationary and only the arms should move. The forearms should do no other work except for holding the dumbbell; therefore do not try to pull the dumbbell up using the forearms.\nLower the resistance straight down to the starting position. Breathe in as you perform this step.\nRepeat the movement for the specified amount of repetitions.\nSwitch sides and repeat again with the other arm.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            database.MuscleGroupModel().insertMuscleGroup(new MuscleGroupData(2, "Back", exercises));

            //-------------------------------------------------------------------------------------------------

            exerciseUrls = new ArrayList<>();
            exercises = new ArrayList<>();
            exerciseUrls.add("https://cdn.pixabay.com/photo/2018/12/26/08/52/barbell-3895455_960_720.jpg");
            exerciseUrls.add("https://c.pxhere.com/photos/3d/2e/man_person_power_strength_strong_fitness_body_muscles-641586.jpg!d");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/d/db/101_Armenian_Woman_Exercising_Shoulder_Back_Press.png");
            exerciseUrls.add("https://c1.staticflickr.com/2/1765/28028144087_cd506b3c05_b.jpg");
            exercise = new ExerciseData("Back Squat", "In strength training and fitness, the squat is a compound, full body exercise that trains primarily the muscles of the thighs, hips and buttocks, quadriceps femoris muscle, hamstrings, as well as strengthening the bones, ligaments and insertion of the tendons throughout the lower body.\nSquats are considered a vital exercise for increasing the strength and size of the legs as well as developing core strength.\nSquats are typically used to hone back, thigh, and hip stability. Isometrically, the lower back, the upper back, the abdominals, the trunk muscles, the costal muscles, and the shoulders and arms are all essential to the exercise and thus are trained when squatting with the proper form.\n\nBegin with the barbell supported on top of the traps. The chest should be up and the head facing forward. Adopt a hip-width stance with the feet turned out as needed.\nDescend by flexing the knees, refraining from moving the hips back as much as possible. This requires that the knees travel forward. Ensure that they stay align with the feet. The goal is to keep the torso as upright as possible.\nContinue all the way down, keeping the weight on the front of the heel. At the moment the upper legs contact the lower legs reverse the motion, driving the weight upward.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/c/c3/Front-squat-1-857x1024.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/0/02/Front-squat-2-857x1024.png");
            exerciseUrls.add("https://media.defense.gov/2014/Jan/22/2000882271/-1/-1/0/140119-F-JW310-008.JPG");
            exerciseUrls.add("https://www.army.mil/e2/-images/2008/09/24/22783/size0-army.mil-22783-2009-02-24-100248.jpg");
            exercise = new ExerciseData("Front Squat", "Front squats emphasize the quads over the glutes and hams as opposed to back squat, which means you'll sacrifice some of the load.\n\nThis movement generally requires some pretty serious upper-back and core strength to maintain a neutral spine and keep you from missing weights. Don't be surprised if adding these into your workout routine beefs up your back as well! Also, with a front squat, you naturally maintain a much more vertical position, which may decrease the risk of low-back injury.\n\nThis exercise is best performed inside a squat rack for safety purposes. To begin, first set the bar on a rack that best matches your height. Once the correct height is chosen and the bar is loaded, bring your arms up under the bar while keeping the elbows high and the upper arm slightly above parallel to the floor. Rest the bar on top of the deltoids and cross your arms while grasping the bar for total control.\nLift the bar off the rack by first pushing with your legs and at the same time straightening your torso.\nStep away from the rack and position your legs using a shoulder width medium stance with the toes slightly pointed out. Keep your head up at all times as looking down will get you off balance and also maintain a straight back. This will be your starting position.\nBegin to slowly lower the bar by bending the knees as you maintain a straight posture with the head up. Continue down until the angle between the upper leg and the calves becomes slightly less than 90-degrees (which is the point in which the upper legs are below parallel to the floor). Inhale as you perform this portion of the movement. Tip: If you performed the exercise correctly, the front of the knees should make an imaginary straight line with the toes that is perpendicular to the front. If your knees are past that imaginary line (if they are past your toes) then you are placing undue stress on the knee and the exercise has been performed incorrectly.\nBegin to raise the bar as you exhale by pushing the floor mainly with the middle of your foot as you straighten the legs again and go back to the starting position.\nRepeat for the recommended amount of repetitions.\n\nThis is not an exercise to be taken lightly. If you have back issues, substitute it with the dumbbell squat variation or a leg press instead. If you have a healthy back, ensure perfect form and never slouch the back forward as this can cause back injury. Be cautious as well with the weight used; in case of doubt, use less weight rather than more. The front squat is a very safe exercise but only if performed properly. This version of the squat is better suited for advanced athletes.\n\nYou can place a small block under the heels to improve balance.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://cdn.pixabay.com/photo/2017/06/09/11/15/deadlift-2386565_960_720.jpg");
            exerciseUrls.add("https://media.defense.gov/2011/Sep/12/2000220813/-1/-1/0/110910-F-XH170-236.JPG");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/f/f8/Stefanie_Dr%C3%B6xler_clean_and_jerk-4316.jpg");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/0/0c/Sargis_Martirosjan_Snatch_181_Split.jpg");
            exerciseUrls.add("https://image.boxrox.com/2016/07/snatch-female-crossfitter.png");
            exercise = new ExerciseData("Snatch", "Snatches take some serious dedication and technique to master, but they can be unrivaled when you are trying to improve jumping power or squat strength. In fact, one scientific study found a nearly 18-percent greater improvement in squat 1RM after following an Olympic-based program compared to a traditional powerlifting program.\n\nPlace your feet at a shoulder width stance with the barbell resting right above the connection between the toes and the rest of the foot.\nWith a palms facing down grip, bend at the knees and keeping the back flat grab the bar using a wider than shoulder width grip. Bring the hips down and make sure that your body drops as if you were going to sit on a chair. This will be your starting position.\nStart pushing the floor as if it were a moving platform with your feet and simultaneously start lifting the barbell keeping it close to your legs.\nAs the bar reaches the middle of your thighs, push the floor with your legs and lift your body to a complete extension in an explosive motion.\nLift your shoulders back in a shrugging movement as you bring the bar up while lifting your elbows out to the side and keeping them above the bar for as long as possible.\nNow in a very quick but powerful motion, you have to get your body under the barbell when it has reached a high enough point where it can be controlled and drop while locking your arms and holding the barbell overhead as you assume a squat position.\nFinalize the movement by rising up out of the squat position to finish the lift. At the end of the lift both feet should be on line and the arms fully extended holding the barbell overhead.\n\nThis is a very advanced exercise so be extremely careful with the weight used. Bad form on this exercise can lead to serious injury.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://media.defense.gov/2013/Nov/01/2000899841/-1/-1/0/131026-F-KI416-002.JPG");
            exerciseUrls.add("https://media.defense.gov/2011/Sep/12/2000220813/-1/-1/0/110910-F-XH170-236.JPG");
            exerciseUrls.add("http://upl.stack.com/wp-content/uploads/2012/02/13120219/power-clean-how-to-lead-STACK.jpg");
            exercise = new ExerciseData("Power clean", "Power cleans take some serious dedication and technique to master, but they can be unrivaled when you are trying to improve jumping power or squat strength. In fact, one scientific study found a nearly 18-percent greater improvement in squat 1RM after following an Olympic-based program compared to a traditional powerlifting program.\n\nPhase 1: Starting Position\nStand with your feet slightly wider than shoulder width apart and toes pointing out slightly.\nSquat down and grasp bar with a closed, pronated grip. Your hands should be slightly wider than shoulder width apart outside knees with elbows fully extended.\nPlace the bar about 1 inch in front of your shins and over the balls of your feet.\nYour back should be flat or slightly arched, your chest held up and out and your shoulder blades should be retracted.\nKeep your head in a neutral position (in line with vertebral column and not tilted or rotated) with your eyes focused straight ahead. Inhale during this phase.Phase 2: First Pull Phase\nLift the bar from the floor by forcefully extending the hips and the knees as you exhale. Tip: The upper torso should maintain the same angle. Do not bend at the waist yet and do not let the hips rise before the shoulders (this would have the effect of pushing the glutes in the air and stretching the hamstrings.\nKeep elbows fully extended with the head in a neutral position and the shoulders over the bar.\nAs the bar raises keep it as close to the shins as possible.\n\nPhase 2: First Pull Phase\nLift the bar from the floor by forcefully extending the hips and the knees as you exhale. Tip: The upper torso should maintain the same angle. Do not bend at the waist yet and do not let the hips rise before the shoulders (this would have the effect of pushing the glutes in the air and stretching the hamstrings.\nKeep elbows fully extended with the head in a neutral position and the shoulders over the bar.\nAs the bar raises keep it as close to the shins as possible.\n\nPhase 3: Transition or Scoop Phase\nAs the bar passes the knees, thrust your hips forward and slightly bend the knees to avoid locking them. Tip: At this point your thighs should be against the bar.\nKeep the back flat or slightly arched, elbows fully extended and your head neutral. Tip: You will hold your breath until the next phase.\n\nPhase 4: Second Pull Phase\nInhale and then forcefully and quickly extend your hips and knees and stand on your toes.\nKeep the bar as close to your body as possible. Tip: Your back should be flat with the elbows pointed out to the sides and your head in a neutral position. Also, keep your shoulders over the bar and arms straight as long as possible.\nWhen your lower body joints are fully extended, shrug the shoulders upward rapidly without letting the elbows flex yet. Exhale during this portion of the movement.\nAs the shoulders reach their highest elevation flex your elbows to begin pulling your body under the bar.\nContinue to pull the arms as high and as long as possible. Tip: Due to the explosive nature of this phase, your torso will be erect or with an arched back, your head will be tilted back slightly and your feet may lose contact with the floor.\n\nPhase 5: Catch Phase\nAfter the lower body has fully extended and the bar reaches near maximal height, pull your body under the bar and rotate the arms around and under the bar.\nSimultaneously, flex the hips and knees into a quarter squat position.\nOnce the arms are under the bar, inhale and then lift your elbows to position the upper arms parallel to the floor. Rack the bar across the front of your collar bones and front shoulder muscles.\nCatch the bar with an erect and tight torso, a neutral head position and flat feet. Exhale during this movement.\nStand up by extending the hips and knees to a fully erect position.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://i.ytimg.com/vi/nNsdy8jACpo/maxresdefault.jpg");
            exerciseUrls.add("https://i.ytimg.com/vi/6wIId6pQzHw/maxresdefault.jpg");
            exercise = new ExerciseData("Bulgarian Split Squat", "This one is deceptively difficult, partly because of balance and partly because you're training one side at a time. The Bulgarian split squat is essentially a split squat, but your rear leg is elevated, which forces the front leg to pick up more of the workload. Try it on a Smith machine if you find it difficult to balance the weight.\n\nStart by standing about 2 to 3 feet in front of a flat bench with your back facing the bench. Have a barbell in front of you on the floor. Tip: Your feet should be shoulder width apart from each other.\nBend the knees and use a pronated grip with your hands being wider than shoulder width apart from each other to lift the barbell up until you can rest it on your chest.\nThen lift the barbell over your head and rest it on the base of your neck. Move one foot back so that your toe is resting on the flat bench. Your other foot should be stationary in front of you. Keep your head up at all times as looking down will get you off balance and also maintain a straight back. Tip: Make sure your back is straight and chest is out while performing this exercise.\nAs you inhale, slowly lower your leg until your thigh is parallel to the floor. At this point, your knee should be over your toes. Your chest should be directly above the middle of your thigh.\nLeading with the chest and hips and contracting the quadriceps, elevate your leg back to the starting position as you exhale.\nRepeat for the recommended amount of repetitions.\nSwitch legs and repeat the movement.\n\nYou can use a step up box to place your toes on to perform this exercise. You can even elevate the step up box. The higher the step up box, the more difficult it is to perform this exercise.\n\nKeeping your balance with this exercise can be challenging. This is an advanced exercise and should not be performed unless you are an experienced weight lifter.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Hack_squat_machine_1.svg/2000px-Hack_squat_machine_1.svg.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/f/f5/Narrow-stance-hack-squats-2-1024x721.png");
            exercise = new ExerciseData("Hack Squat", "One of the primary benefits of the hack squat is that you can manipulate foot placement. A high placement allows you to descend further, which emphasizes the glutes and hamstrings. A lower placement means the quads take up a greater percentage of the workload. A placement slightly forward of the hips may be the most comfortable.\n\nIt's also easier to spot on machine exercises and use advanced techniques like forced reps and dropsets, because you don't have to worry about collapsing under a weight.\n\nWhile you can do reverse hacks on this machine, in which you're facing toward the apparatus, that version offers very little spinal protection and is not recommended unless you really know what you're doing.\n\nPlace the back of your torso against the back pad of the machine and hook your shoulders under the shoulder pads provided.\nPosition your legs in the platform using a shoulder width medium stance with the toes slightly pointed out. Tip: Keep your head up at all times and also maintain the back on the pad at all times.\nPlace your arms on the side handles of the machine and disengage the safety bars (which on most designs is done by moving the side handles from a facing front position to a diagonal position).\nNow straighten your legs without locking the knees. This will be your starting position.\nBegin to slowly lower the unit by bending the knees as you maintain a straight posture with the head up (back on the pad at all times). Continue down until the angle between the upper leg and the calves becomes slightly less than 90-degrees (which is the point in which the upper legs are below parallel to the floor). Inhale as you perform this portion of the movement. Tip: If you performed the exercise correctly, the front of the knees should make an imaginary straight line with the toes that is perpendicular to the front. If your knees are past that imaginary line (if they are past your toes) then you are placing undue stress on the knee and the exercise has been performed incorrectly.\nBegin to raise the unit as you exhale by pushing the floor with mainly with the heel of your foot as you straighten the legs again and go back to the starting position.\nRepeat for the recommended amount of repetitions.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            exerciseUrls = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/0/0a/Walking-lunges-3.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/8/8e/Lunges-2-2.png");
            exerciseUrls.add("https://images.pexels.com/photos/999257/pexels-photo-999257.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/4/45/Rear-lunges-1-1024x1015.png");
            exercise = new ExerciseData("Lunges", "Multi-joint lunges require hip and knee extension, which gives you the stimulus for the thighs and glutes. They can be done standing in place, or stepping forward or backward-decide for yourself which subtle variation you prefer. You can also choose between a barbell and dumbbells.\n\nLunges are best done when your legs are prefatigued, so a moderate load works particularly well for this exercise. Step forward far enough that you go straight down when you descend, rather than leaning forward.\n\nFor knee health, keep the knees behind an imaginary line that comes up from your toes when stepping forward, and drive the weight back up through your midfoot.\n\nStand with your torso upright holding two dumbbells in your hands by your sides or holding barbell on your upper back. This will be your starting position.\nStep forward with your right leg around 2 feet or so from the foot being left stationary behind and lower your upper body down, while keeping the torso upright and maintaining balance. Inhale as you go down. Note: As in the other exercises, do not allow your knee to go forward beyond your toes as you come down, as this will put undue stress on the knee joint. Make sure that you keep your front shin perpendicular to the ground.\nUsing mainly the heel of your foot, push up and go back to the starting position as you exhale.\nRepeat the movement for the recommended amount of repetitions and then perform with the left leg.\n\nThis is a movement that requires a great deal of balance so if you suffer from balance problems you may wish to either avoid it or just use your own bodyweight while holding on to a fixed object. Definitely never perform with a barbell on your back if you suffer from balance issues.\n\nThere are several ways to perform the exercise:\nOne way is to alternate each leg. For instance do one repetition with the right, then the left, then the right and so on.\nThe other way is to do what I call a static lunge where your starting position is with one of your feet already forward. In this case, you just go up and down from that starting position until you are done with the recommended amount of repetitions. Then you switch legs and do the same.\nA more challenging version is the walking lunges where you walk across the room but in a lunging fashion. For walking lunges the leg being left back has to be brought forward after the lunging action has happened in order to continue moving ahead. This version is reserved for the most advanced athletes.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            database.MuscleGroupModel().insertMuscleGroup(new MuscleGroupData(3, "Legs", exercises));

            //-------------------------------------------------------------------------------------------------

            exerciseUrls = new ArrayList<>();
            exercises = new ArrayList<>();
            exerciseUrls.add("https://cdn2.coachmag.co.uk/sites/coachmag/files/styles/insert_main_wide_image/public/2016/05/bodyweight_workout_2-4b_hanging_leg_raise.jpg?itok=qx-93Wqs");
            exerciseUrls.add("https://www.t-nation.com/system/publishing/articles/10004907/original/Hanging-Leg-Raise-3-Mistakes-to-Avoid.jpg?1497297219");
            exercise = new ExerciseData("Hanging Leg Raises", "Get your legs as high as possible on each rep without using momentum to swing them up.\n\nYou can also increase the degree of difficulty by holding a dumbbell or medicine ball between your knees or ankles, which allows you to train in a lower rep range.\n\nHang from a chin-up bar with both arms extended at arms length in top of you using either a wide grip or a medium grip. The legs should be straight down with the pelvis rolled slightly backwards. This will be your starting position.\nRaise your legs until the torso makes a 90-degree angle with the legs. Exhale as you perform this movement and hold the contraction for a second or so.\nGo back slowly to the starting position as you breathe in.\nRepeat for the recommended amount of repetitions.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            database.MuscleGroupModel().insertMuscleGroup(new MuscleGroupData(4, "Abs", exercises));

            //-------------------------------------------------------------------------------------------------

            exerciseUrls = new ArrayList<>();
            exercises = new ArrayList<>();
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Barbell_shoulder_press_1.svg/500px-Barbell_shoulder_press_1.svg.png");
            exerciseUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Barbell_shoulder_press_2.svg/448px-Barbell_shoulder_press_2.svg.png");
            exercise = new ExerciseData("Barbell Shoulder Press", "Sit on a bench with back support in a squat rack. Position a barbell at a height that is just above your head. Grab the barbell with a pronated grip (palms facing forward).\nOnce you pick up the barbell with the correct grip width, lift the bar up over your head by locking your arms. Hold at about shoulder level and slightly in front of your head. This is your starting position.\nLower the bar down to the shoulders slowly as you inhale.\nLift the bar back up to the starting position as you exhale.\nRepeat for the recommended amount of repetitions.\n\nThis exercise can also be performed standing.", exerciseUrls);
            exercises.add(exercise);
            database.ExerciseModel().insertExercise(exercise);

            database.MuscleGroupModel().insertMuscleGroup(new MuscleGroupData(5, "Shoulders", exercises));

            //-------------------------------------------------------------------------------------------------


        }

        @Override
        protected void onPostExecute(Void aVoid)
        {
            super.onPostExecute(aVoid);
            listener.databaseCheck();
        }
    }
}
