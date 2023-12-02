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
  private int planck;
  private int pi;
  private int reduced_planck;
  public constants(int planck_val,int pi_val){
    planck = planck_val;
    pi = pi_val;
    int tempint = pi*2;
    reduced_planck = planck/tempint;
  }
  public getplanck(){
    return planck;
  }
  public getpi(){
    return pi;
  }
  public getredplanck(){
    return reduced_planck;
  }
}
