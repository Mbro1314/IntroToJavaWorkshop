import ddf.minim.*;       
Minim minim = new Minim(this); 
/**
 We're going to use BANANAS to stop and start songs. Different bananas will play different songs.
 If you haven't used the Makey Makey before, check out this guide before you start: http://makeymakey.com/howto.php
 
 1. Download a song from   : youtube-mp3.org
 2. Plug the Makey Makey into the bananas.
 3. Finish the Processing code below so that touching a banana will start and stop a song.
 **/
AudioPlayer yellowSubmarine;
AudioPlayer yellowSubmarine2;              //1. Change to the name of your song
boolean yellowSubmarineIsStopped = true;  
boolean yellowSubmarine2IsStopped = true;  

void loadSongs() {
  yellowSubmarine = minim.loadFile("bob.mp3");  //2. Drop mp3 onto this sketch and put its name here
yellowSubmarine2 = minim.loadFile("ride.mp3");  //2. Drop mp3 onto this sketch and put its name here
}

void keyPressed() {

  if (keyCode == UP) {
    /* 3. If yellowSubmarineIsStopped, play it, and set yellowSubmarineIsStopped to false. */
   if(yellowSubmarineIsStopped == true){
   playSong(yellowSubmarine);
yellowSubmarineIsStopped = false;  }
    /* 4. Otherwise, stop it, and set yellowSubmarineIsStopped to true. */
else {
  stopSong(yellowSubmarine);
yellowSubmarineIsStopped = true;

}  
 

}  
if (keyCode == DOWN) {
   println (keyCode);
    /* 3. If yellowSubmarineIsStopped, play it, and set yellowSubmarineIsStopped to false. */
   if(yellowSubmarine2IsStopped == true){
   playSong(yellowSubmarine2);
yellowSubmarine2IsStopped = false;  }
    /* 4. Otherwise, stop it, an set yellowSubmarineIsStopped to true. */
else {
  stopSong(yellowSubmarine2);
yellowSubmarine2IsStopped = true;

  }

  /* 5. Add other songs for the other bananas. keyCode will tell you which banana was pressed. */
  println("you pressed " + keyCode);
  }
}
void playSong(AudioPlayer song) {
  song.play();
}

void stopSong(AudioPlayer song)
{
  song.pause();
}

void draw() {ellipse(50,50, mouseY,mouseX);}

void setup() {
  loadSongs();
  
  
  
}

