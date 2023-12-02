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
  public constants(float planck_val,float pi_val){
    planck = planck_val;
    pi = pi_val;
    int tempint = pi*2;
    reduced_planck = planck/tempint;
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
}
