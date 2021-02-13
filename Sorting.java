/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* @author Roberto Vallecillos & Diego Cordova
* Ultima modificacion: 2021-02-10
*
* clase sortGenerator
* Generate a sorting type class using factory Design pattern
********************************************************/

import java.util.*;

public class Sorting {
    
    /**
     * Constructor methd, creates an iteration of the class
     */
    public Comparable[] BubbleSort(Comparable[] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j <array.length; j++){
				if(array[j].compareTo(array[i] == 1){
					Comparable temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public Comparable[] QuickSort(Comparable[] array, int x, int y){
		int i = x;
		int j = y;
		Comparable temp;
		Comparable medio = array[(x+y)/2];
		while (x <= y){
			while(array[x].compareTo(medio) <= 0 && x < y) i++;
			while(array[y].compareTo(medio) > 0)j--;
			if (x < y){
				temp = array[x];
				array[x] = array[y];
				array[y] = temp;
				
			}
		}
		array[x] = array[j];
		array[j] = medio;
		if(x < j-1){
			QuickSort(array, x, j-1);
		}if(j+1 < y){
			QuickSort(array, j+1, y);
		}
		return array;
	}
	
	public Comparable[] RadixSort(Comparable[] array, int x, int y){
		Comparable medio = array[(x+y)/2];
		while (x <= y){
			while(array[x] < medio &) i++;
			while(array[y] > medio)j--;
			if (x < y){
				Comparable temp = array[x];
				array[x] = array[y];
				array[y] = temp;
				}
			}
	}
	
	public Comparable[] GnomeSort(Comparable[] array, int x){
		int ind = 0;
		while (ind < x){
			if (ind == 0){
				index++;
			}if(array[ind].compareTo(array[ind-1) > 0){
				index++;
			}else{
				Comparable temp = 0;
				temp = array[ind];
				array[ind] = array[ind-1];
				array[ind-1] = temp;
				index--;
			}
		}
		return array;
	}
	
	public Comparable[] MergeSort(Comparable[] array, int x, int y, int z){
		int i, j, k;
		Comparable[] temp = new Comparable[array.length];
		for (i = x; i <= z; i++){
			temp[i] = array[i];
		}
		i = x;
		j = y+1;
		k = x;
		while(i <= y && j <= z){
			if (temp[i].CompareTo(temp[j] <= 0){
				array[k++] = temp[i++];
			}else{
				array[k++] = temp[j++];	
			}
		}while(i <= y){
			array[k++] = temp[i++];
		}
	}
	return array;
}