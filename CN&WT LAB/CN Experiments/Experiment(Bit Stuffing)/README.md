# Experiment 1 - Bit Stuffing

## Aim of the Experiment
Implement the data link layer framing method such as Bit Stuffing.

### Step by step procedure of experiment
1. Each frame begins and ends with special pattern 01111110
2. When sender's DLL finds 5 consecutive 1's in data stream, stuffs 0.
3. When receiver sees 5 1's followed by 0, de-stuffs.

### Output

![output](bit.png)
 
