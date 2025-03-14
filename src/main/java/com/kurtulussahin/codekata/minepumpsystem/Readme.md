# Mine Pump System - Real Object-Oriented Design  

## Overview  
This project is a Java implementation of the *Mine Pump* system, following the *Real Object-Oriented* (OO) approach described by Carlo Pescio. Instead of using a centralized controller, the design distributes responsibilities across collaborating objects, allowing for better modularity, testability, and maintainability.  

## Problem Description  
The *Mine Pump* system is responsible for managing water levels in a mine while ensuring safety from gas hazards. The system consists of:  

- **Water Level Sensors (D, E):** Determines when to pump water out of the sump.  
- **Gas Sensors (A, B, C):** Monitors carbon monoxide, methane, and airflow.  
- **Pump:** Removes water when necessary but cannot operate under unsafe conditions.  
- **Alarm:** Triggers warnings when gas levels become critical or the pump fails.  

The challenge is to implement this system without a monolithic controller, ensuring that each object encapsulates its own behavior.  

## Design Principles  
This implementation follows a true OO approach by eliminating a central *PumpController* and distributing behavior across meaningful domain objects. Key design choices include:  

### 1. Encapsulation of Behavior  
- A `SumpProbe` determines when water should be drained.  
- `GasSensor` instances determine when gas levels are critical.  
- A `SafeEngine` ensures the pump operates only under safe conditions.  

### 2. Decentralization  
- The system’s intelligence emerges from interactions between objects, rather than a centralized controller making all decisions.  

### 3. Polymorphism and Extensibility  
- The design allows for different sensor types (e.g., digital vs. analog level sensors) without modifying core logic.  

### 4. Testability  
- Each component can be tested in isolation due to well-defined responsibilities.  

## Implementation  
The project is structured into several key classes:  

- **`SumpProbe`** – Determines when pumping is required.  
- **`GasSensor`** – Evaluates gas safety levels.  
- **`SafeEngine`** – Ensures the pump operates only when conditions are safe.  
- **`GasAlarm`** – Triggers alerts when hazardous conditions arise.  
- **`SumpPump`** – Manages the actual pumping process.  
- **`MinePlant`** – Acts as a factory/builder to configure and instantiate the system.  

## Running the Project  
To run the project, compile the Java files and execute the main entry point. Since this implementation focuses on a real OO design, it can be easily extended to integrate with actual hardware or simulations.  

## References  
- Carlo Pescio’s article on *Real OO* and *Life without a Controller*: [Original Post](http://www.carlopescio.com/)  

## License  
This project is open-source and available for modification and extension.  