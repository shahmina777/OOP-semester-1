class Cinema{

 String name;
 String location;
 Screen[] screens;

Cinema(String name, String location,int totalScreens){ 

  this.name=name;
  this.location;
  this.totalScreens=totalScreens;
}



    public void addScreen(int index, Screen screen) {
        if (index < 0 || index >= screens.length) {
            System.out.println("Invalid screen index.");
            return;
        }
        if (screens[index] != null) {
            System.out.println("Screen at index " + index + " is already assigned.");
            return;
        }
        screens[index] = screen;
        System.out.println("Screen " + screen.getScreenNumber() + " added at index " + index);
    } 

}
