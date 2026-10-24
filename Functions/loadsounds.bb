Function loadsounds%()
    Local local0%
    renderloading(45.0, getlocalstring("loading", "sounds"), $00, 0.025)
    snd_i = (New soundinstance)
    snd_i\Field36[$00] = loadsound_strict("SFX\Door\DoorDecayOpen.ogg")
    snd_i\Field48[$00] = loadsound_strict("SFX\Door\DoorDecayClose.ogg")
    snd_i\Field36[$01] = loadsound_strict("SFX\Door\ElevatorDecayOpen.ogg")
    snd_i\Field48[$01] = loadsound_strict("SFX\Door\ElevatorDecayClose.ogg")
    snd_i\Field36[$02] = loadsound_strict("SFX\Door\Door2DecayOpen.ogg")
    snd_i\Field48[$02] = loadsound_strict("SFX\Door\Door2DecayClose.ogg")
    snd_i\Field36[$03] = loadsound_strict("SFX\Door\BigDoorDecayOpen.ogg")
    snd_i\Field48[$03] = loadsound_strict("SFX\Door\BigDoorDecayClose.ogg")
    For local0 = $00 To $0D Step $01
        If (local0 < $02) Then
            snd_i\Field3[local0] = loadsound_strict((("SFX\Interact\KeyCardUse" + (Str local0)) + ".ogg"))
            snd_i\Field21[local0] = loadsound_strict((("SFX\Interact\ScannerUse" + (Str local0)) + ".ogg"))
            snd_i\Field0[local0] = loadsound_strict((("SFX\Interact\DoorBudge" + (Str local0)) + ".ogg"))
            snd_i\Field29[local0] = loadsound_strict((("SFX\Character\Gunshot" + (Str local0)) + ".ogg"))
            snd_i\Field37[local0] = loadsound_strict((("SFX\Room\Hiss" + (Str local0)) + ".ogg"))
            YXZ2BB66B($00, local0) = loadsound_strict((("SFX\Radio\RadioAlarm" + (Str local0)) + ".ogg"))
            snd_i\Field4[local0] = loadsound_strict((("SFX\Interact\LowBattery" + (Str local0)) + ".ogg"))
            snd_i\Field31[local0] = loadsound_strict((("SFX\Room\914Chamber\Knob" + (Str local0)) + ".ogg"))
            TXDBZF46ZXF($05, $00, local0) = loadsound_strict((("SFX\Step\StepFluid" + (Str local0)) + ".ogg"))
        EndIf
        If (local0 < $03) Then
            TZ2064ZFDB($00, local0) = loadsound_strict((("SFX\Door\DoorOpen" + (Str local0)) + ".ogg"))
            TX6X4XZX2F($00, local0) = loadsound_strict((("SFX\Door\DoorClose" + (Str local0)) + ".ogg"))
            TZ2064ZFDB($01, local0) = loadsound_strict((("SFX\Door\ElevatorOpen" + (Str local0)) + ".ogg"))
            TX6X4XZX2F($01, local0) = loadsound_strict((("SFX\Door\ElevatorClose" + (Str local0)) + ".ogg"))
            TZ2064ZFDB($02, local0) = loadsound_strict((("SFX\Door\Door2Open" + (Str local0)) + ".ogg"))
            TX6X4XZX2F($02, local0) = loadsound_strict((("SFX\Door\Door2Close" + (Str local0)) + ".ogg"))
            TZ2064ZFDB($03, local0) = loadsound_strict((("SFX\Door\BigDoorOpen" + (Str local0)) + ".ogg"))
            TX6X4XZX2F($03, local0) = loadsound_strict((("SFX\Door\BigDoorClose" + (Str local0)) + ".ogg"))
            TZ2064ZFDB($04, local0) = loadsound_strict((("SFX\Door\OfficeDoorOpen" + (Str local0)) + ".ogg"))
            TZ2064ZFDB($05, local0) = loadsound_strict((("SFX\Door\WoodenDoorOpen" + (Str local0)) + ".ogg"))
            TZ2064ZFDB($06, local0) = loadsound_strict((("SFX\Door\FenceDoorOpen" + (Str local0)) + ".ogg"))
            snd_i\Field47[local0] = loadsound_strict((("SFX\Door\BigDoorError" + (Str local0)) + ".ogg"))
            snd_i\Field35[local0] = loadsound_strict((("SFX\SCP\173\NeckSnap" + (Str local0)) + ".ogg"))
            D8BF2B828($00, local0) = loadsound_strict((("SFX\Character\D9341\Cough" + (Str local0)) + ".ogg"))
            D8BF2B828($01, local0) = loadsound_strict((("SFX\Character\D9341\Cough" + (Str local0)) + "Gas.ogg"))
            snd_i\Field58[local0] = loadsound_strict((("SFX\SCP\106\Corrosion" + (Str local0)) + ".ogg"))
            snd_i\Field58[(local0 + $05)] = loadsound_strict((("SFX\SCP\106\WallDecay" + (Str local0)) + ".ogg"))
            snd_i\Field27[local0] = loadsound_strict((("SFX\SCP\173\Rattle" + (Str local0)) + ".ogg"))
            snd_i\Field5[local0] = loadsound_strict((("SFX\Room\Light" + (Str local0)) + ".ogg"))
            TXDBZF46ZXF($02, $00, local0) = loadsound_strict((("SFX\Step\StepPD" + (Str local0)) + ".ogg"))
            TXDBZF46ZXF($03, $00, local0) = loadsound_strict((("SFX\Step\StepCloth" + (Str local0)) + ".ogg"))
            TXDBZF46ZXF($04, $00, local0) = loadsound_strict((("SFX\Step\StepForest" + (Str local0)) + ".ogg"))
            snd_i\Field28[local0] = loadsound_strict((("SFX\Alarm\Alarm" + (Str (local0 + $01))) + ".ogg"))
        EndIf
        If (local0 < $04) Then
            snd_i\Field1[local0] = loadsound_strict((("SFX\SCP\106\Decay" + (Str local0)) + ".ogg"))
            snd_i\Field44[local0] = loadsound_strict((("SFX\Character\D9341\BloodDrip" + (Str local0)) + ".ogg"))
            snd_i\Field46[local0] = loadsound_strict((("SFX\Interact\PickItem" + (Str local0)) + ".ogg"))
            snd_i\Field51[(local0 + $03)] = loadsound_strict((("SFX\Step\NPCs\939_966\StepMetal" + (Str local0)) + ".ogg"))
            If (local0 < $03) Then
                snd_i\Field51[local0] = loadsound_strict((("SFX\Step\NPCs\MTF\StepMetal" + (Str local0)) + ".ogg"))
                snd_i\Field51[(local0 + $07)] = loadsound_strict((("SFX\Step\NPCs\049\StepMetal" + (Str local0)) + ".ogg"))
                snd_i\Field51[(local0 + $0A)] = loadsound_strict((("SFX\Step\NPCs\096\Step" + (Str local0)) + ".ogg"))
            EndIf
        EndIf
        If (local0 < $05) Then
            TFB8222B2X($00, local0) = loadsound_strict((("SFX\Character\D9341\Breath" + (Str local0)) + ".ogg"))
            TFB8222B2X($01, local0) = loadsound_strict((("SFX\Character\D9341\Breath" + (Str local0)) + "Gas.ogg"))
        EndIf
        If (local0 < $06) Then
            snd_i\Field24[local0] = loadsound_strict((("SFX\SCP\372\Rustle" + (Str local0)) + ".ogg"))
        EndIf
        If (local0 < $08) Then
            TXDBZF46ZXF($00, $00, local0) = loadsound_strict((("SFX\Step\Step" + (Str local0)) + ".ogg"))
            TXDBZF46ZXF($00, $01, local0) = loadsound_strict((("SFX\Step\Run" + (Str local0)) + ".ogg"))
            TXDBZF46ZXF($01, $00, local0) = loadsound_strict((("SFX\Step\StepMetal" + (Str local0)) + ".ogg"))
            TXDBZF46ZXF($01, $01, local0) = loadsound_strict((("SFX\Step\RunMetal" + (Str local0)) + ".ogg"))
        EndIf
        If (local0 < $09) Then
            YXZ2BB66B($01, local0) = loadsound_strict((("SFX\Radio\SCPRadio" + (Str local0)) + ".ogg"))
        EndIf
        If (local0 < $0E) Then
            snd_i\Field40[local0] = loadsound_strict((("SFX\Horror\Horror" + (Str local0)) + ".ogg"))
        EndIf
        snd_i\Field50[local0] = loadsound_strict((("SFX\Character\D9341\Damage" + (Str local0)) + ".ogg"))
    Next
    snd_i\Field42 = loadsound_strict("SFX\Door\DoorBang.ogg")
    snd_i\Field33 = loadsound_strict("SFX\Character\FallingWind.ogg")
    LoopSound(snd_i\Field33, $01)
    snd_i\Field26 = loadsound_strict("SFX\Door\DoorOpen079.ogg")
    snd_i\Field52 = loadsound_strict("SFX\Door\DoorClose079.ogg")
    snd_i\Field38 = loadsound_strict("SFX\Interact\DoorLock.ogg")
    snd_i\Field53 = loadsound_strict("SFX\Door\DoorOpenFast.ogg")
    snd_i\Field12 = loadsound_strict("SFX\Room\LockroomSiren.ogg")
    snd_i\Field7 = loadsound_strict("SFX\Room\Camera.ogg")
    snd_i\Field30 = loadsound_strict("SFX\SCP\173\StoneDrag.ogg")
    snd_i\Field43 = loadsound_strict("SFX\Character\BulletMiss.ogg")
    snd_i\Field54 = loadsound_strict("SFX\Character\BulletHit.ogg")
    snd_i\Field56 = loadsound_strict("SFX\Room\Tesla\Idle.ogg")
    snd_i\Field32 = loadsound_strict("SFX\Room\Tesla\WindUp.ogg")
    snd_i\Field34 = loadsound_strict("SFX\Room\Tesla\PowerUp.ogg")
    snd_i\Field6 = loadsound_strict("SFX\Room\Tesla\Shock.ogg")
    snd_i\Field14 = loadsound_strict("SFX\Room\TunnelBurst.ogg")
    snd_i\Field18 = loadsound_strict("SFX\SCP\914\Refining.ogg")
    snd_i\Field59 = loadsound_strict("SFX\Interact\LeverFlip.ogg")
    snd_i\Field11 = loadsound_strict("SFX\Room\LightSwitch.ogg")
    snd_i\Field39 = loadsound_strict("SFX\Radio\Squelch.ogg")
    snd_i\Field20 = loadsound_strict("SFX\Radio\Static.ogg")
    snd_i\Field57 = loadsound_strict("SFX\Radio\Static895.ogg")
    snd_i\Field45 = loadsound_strict("SFX\Radio\Buzz.ogg")
    snd_i\Field22 = loadsound_strict("SFX\General\Elevator\Beep.ogg")
    snd_i\Field25 = loadsound_strict("SFX\General\Elevator\Moving.ogg")
    ambientsfxamount[$00] = $08
    ambientsfxamount[$01] = $0B
    ambientsfxamount[$02] = $0C
    ambientsfxamount[$03] = $0F
    ambientsfxamount[$04] = $05
    ambientsfxamount[$05] = $0A
    snd_i\Field58[$03] = loadsound_strict("SFX\SCP\106\Laugh.ogg")
    snd_i\Field58[$04] = loadsound_strict("SFX\SCP\106\Breathing.ogg")
    snd_i\Field55 = loadsound_strict("SFX\Character\D9341\HeartBeat.ogg")
    snd_i\Field49 = loadsound_strict("SFX\Character\Miss.ogg")
    snd_i\Field41 = loadsound_strict("SFX\Character\D9341\BreathGasRelaxed.ogg")
    snd_i\Field15 = loadsound_strict("SFX\Character\D9341\Crouch.ogg")
    snd_i\Field16 = loadsound_strict("SFX\Interact\SCRAMBLE.ogg")
    snd_i\Field19 = loadsound_strict("SFX\Room\Blinds.ogg")
    snd_i\Field10 = loadsound_strict("SFX\Room\SparkShort.ogg")
    i_1123\Field0 = loadsound_strict("SFX\SCP\1123\Ambient.ogg")
    snd_i\Field23 = loadsound_strict("SFX\Room\Fire.ogg")
    snd_i\Field17 = loadsound_strict("SFX\Room\Buzzing.ogg")
    T4BF4FFBD()
    Return $00
End Function
