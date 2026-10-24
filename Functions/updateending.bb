Function updateending%()
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    fps\Field3[$00] = 0.0
    If (-2000.0 < XZ0260X8X2\Field2) Then
        XZ0260X8X2\Field2 = max((XZ0260X8X2\Field2 - fps\Field3[$01]), -1111.0)
    Else
        XZ0260X8X2\Field2 = (XZ0260X8X2\Field2 - fps\Field3[$01])
    EndIf
    giveachievement("055", $01)
    If (((usedconsole = $00) Lor opt\Field30) <> 0) Then
        giveachievement("console", $01)
        If (((selectedcustommap = Null) Lor opt\Field30) <> 0) Then
            Select selecteddifficulty\Field7
                Case difficulties[$02]\Field7
                    giveachievement("keter", $01)
                Case difficulties[$03]\Field7
                    giveachievement("keter", $01)
                    giveachievement("apollyon", $01)
            End Select
            saveachievementsfile()
        EndIf
    EndIf
    shouldplay = $42
    If (-200.0 > XZ0260X8X2\Field2) Then
        stopbreathsound()
        XZ0260X8X2\Field56 = 100.0
        If (XZ0260X8X2\Field49 = $00) Then
            XZ0260X8X2\Field49 = scaleimageex(loadimage_strict("GFX\Menu\ending_screen.png"), menuscale, menuscale, $01)
            shouldplay = $16
            opt\Field48 = opt\Field45
            stopstream_strict(musicchn)
            musicchn = $00
            musicchn = streamsound_strict((("SFX\Music\" + music[$16]) + ".ogg"), (opt\Field48 * opt\Field2), $00)
            nowplaying = shouldplay
            playsound_strict(snd_i\Field11, $00, $00)
        EndIf
        If (-700.0 < XZ0260X8X2\Field2) Then
            If (((-450.0 < (XZ0260X8X2\Field2 + fps\Field3[$01])) And (-450.0 >= XZ0260X8X2\Field2)) <> 0) Then
                playsound_strict(loadtempsound((("SFX\Ending\Ending" + (Str XZ0260X8X2\Field40)) + ".ogg")), $01, $00)
            EndIf
        ElseIf (((-1000.0 > XZ0260X8X2\Field2) And (-2000.0 < XZ0260X8X2\Field2)) <> 0) Then
            If (igm\Field2 <= $00) Then
                local1 = imagewidth(X2Z260BF0Z\Field4[$00])
                local2 = imageheight(X2Z260BF0Z\Field4[$00])
                local3 = (TDD0Z6BXB6\Field6 - (local1 Sar $01))
                local4 = (TDD0Z6BXB6\Field9 - (local2 Sar $01))
                local3 = (Int ((132.0 * menuscale) + (Float local3)))
                local4 = (Int ((432.0 * menuscale) + (Float local4)))
                If (updatemenubutton(local3, local4, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "achievements"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    igm\Field2 = $01
                    shoulddeletegadgets = $01
                EndIf
                local4 = (Int ((75.0 * menuscale) + (Float local4)))
                If (updatemenubutton(local3, local4, (Int (430.0 * menuscale)), (Int (60.0 * menuscale)), getlocalstring("menu", "mainmenu"), $01, $00, $00, $FF, $FF, $FF, $01, 1.0, $00, $00) <> 0) Then
                    shouldplay = $17
                    nowplaying = shouldplay
                    XZ0260X8X2\Field2 = -2000.0
                    shoulddeletegadgets = $01
                    resetinput(10.0)
                    killsounds($01)
                    stopstream_strict(musicchn)
                    musicchn = $00
                    musicchn = streamsound_strict((("SFX\Music\" + music[nowplaying]) + ".ogg"), 0.0, local6)
                    setstreamvolume_strict(musicchn, (opt\Field45 * opt\Field2))
                    initcredits()
                EndIf
                shoulddeletegadgets = $01
            Else
                shouldplay = $16
                updatemenu()
            EndIf
        ElseIf (-2000.0 >= XZ0260X8X2\Field2) Then
            shouldplay = $17
            updatecredits()
        EndIf
    EndIf
    Return $00
End Function
