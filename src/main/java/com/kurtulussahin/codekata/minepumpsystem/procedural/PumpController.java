package com.kurtulussahin.codekata.minepumpsystem.procedural;

import java.util.Random;

public class PumpController {

    static final int WATER_THRESHOLD_MIN = 90;
    static final int WATER_THRESHOLD_MAX = 90;

    static final int GAS_THRESHOLD = 90;

    static boolean isPumpOn = false;

    static int readWaterSensor() {
        return new Random().nextInt(100);
    }

    static int readGasSensor() {
        return new Random().nextInt(100);
    }

    static void controlPump() {

        int waterLevel = readWaterSensor();
        int gasLevel = readGasSensor();
        System.out.println("Su Seviyesi: " + waterLevel + " | Gaz Seviyesi: " + gasLevel);

        if (gasLevel > GAS_THRESHOLD) {
            if (isPumpOn) {
                System.out.println("⚠️ Tehlikeli gaz algılandı! Pompa kapatılıyor.");
                isPumpOn = false;
            } else {
                System.out.println("⚠️ Tehlikeli gaz algılandı! Pompa zaten kapalı.");
            }
        } else if (waterLevel > WATER_THRESHOLD_MAX) {
            if (!isPumpOn) {
                System.out.println("💧 Su seviyesi yüksek! Pompa açılıyor.");
                isPumpOn = true;
            } else {
                System.out.println("💧 Pompa zaten çalışıyor.");
            }
        } else if (waterLevel> WATER_THRESHOLD_MIN) {
            if (!isPumpOn) {
                System.out.println("💧 Su seviyesi tehlikeli değil! Pompa kapalı.");

            } else {
                System.out.println("💧 Pompa zaten çalışıyor. suyu uygun seviyeye çekmeye çalışıyor");
            }
        } else {
            if (isPumpOn) {
                System.out.println("✅ Pompa kapatılıyor.");
                isPumpOn = false;
            }else{
                System.out.println("🔄  Pompa zaten kapalı.");

            }
        }
    }
}