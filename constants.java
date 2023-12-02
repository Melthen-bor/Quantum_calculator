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
    this.planck = planck_val;
    this.pi = pi_val;
    float tempint = this.pi*2;
    this.reduced_planck = planck/tempint;
    this.grav_constant = gravity;
  }
  public float getplanck(){
    return this.planck;
  }
  public float getpi(){
    return this.pi;
  }
  public float getredplanck(){
    return this.reduced_planck;
  }
  public float getgravconst(){
    return this.grav_constant;
  }
  public void setplanck(float setter){
    this.planck = setter;
    float tempint = this.pi*2;
    this.reduced_planck = planck/tempint;
  }
  public void setpi(float setter){
    this.pi = setter;
    float tempint = this.pi*2;
    this.reduced_planck = planck/tempint;
  }
}
