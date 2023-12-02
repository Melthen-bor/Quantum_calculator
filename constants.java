import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import java.lang.math;
public class constants{
  private float planck;
  private float pi;
  private float reduced_planck;
  private float grav_constant;
  public constants(float planck_val,float pi_val,float gravity){
    planck = planck_val;
    pi = pi_val;
    float tempint = pi*2;
    reduced_planck = planck/tempint;
    grav_constant = gravity;
  }
  public float getplanck(){
    return planck;
  }
  public float getpi(){
    return pi;
  }
  public float getredplanck(){
    return reduced_planck;
  }
  public float getgravconst(){
    return grav_constant;
  }
}
