# Smart Fraud Detection Simulator

## Description
This project simulates how financial institutions detect suspicious or fraudulent transactions using rule-based logic.

The system evaluates transaction amount and location against a user's usual behaviour to determine risk levels.

## Cybersecurity Relevance
Fraud detection is a critical component of cybersecurity in banking systems. This project demonstrates how anomaly detection and risk-based logic can be applied to identify suspicious activity.

## Technologies Used
- Java

## Features
- Accepts transaction amount
- Accepts usual and transaction location
- Detects:
  - Normal transactions
  - Suspicious transactions
  - Moderate risk transactions
  - Fraudulent transactions

## How to Run
javac FraudDetectionSystem.java  
java FraudDetectionSystem

## Example Output
=== Smart Fraud Detection Simulator ===  
Enter transaction amount: R8000  
Enter your usual location: Johannesburg  
Enter transaction location: Cape Town  

--- Transaction Result ---  
Transaction Amount: R8000  
Location: Cape Town  
Status: MODERATE RISK  

## What I Learned
- User input handling using Scanner  
- Conditional logic using if/else  
- Applying cybersecurity concepts to real-world scenarios  
- Designing rule-based fraud detection systems  

## Future Improvements
- Add risk scoring (0–100)
- Handle multiple transactions
- Add login anomaly detection
- Store transaction history
