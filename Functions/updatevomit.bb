Function updatevomit%()
    Local local0.decals
    Local local1%
    Local local2#
    catcherrors("UpdateVomit()")
    local2 = (fps\Field3[$00] / 70.0)
    If (0.0 < XZ0260X8X2\Field60) Then
        XZ0260X8X2\Field60 = max((XZ0260X8X2\Field60 - local2), 0.0)
        XZ0260X8X2\Field1 = 2.0
    EndIf
    If (0.0 < XZ0260X8X2\Field82) Then
        XZ0260X8X2\Field82 = (XZ0260X8X2\Field82 - local2)
        If ((millisec Mod $640) < rand($C8, $190)) Then
            If (0.0 = XZ0260X8X2\Field64) Then
                XZ0260X8X2\Field64 = (rnd(10.0, 20.0) * 70.0)
            EndIf
            XZ0260X8X2\Field1 = rnd(0.0, 2.0)
        EndIf
        If ((millisec Mod $FA0) < $C8) Then
            updatecough($32)
        EndIf
        If (((10.0 > XZ0260X8X2\Field82) And (2.0 > rnd(0.0, (XZ0260X8X2\Field82 * 500.0)))) <> 0) Then
            If (((ChannelPlaying(vomitchn) = $00) And (XZ0260X8X2\Field66 = $00)) <> 0) Then
                vomitchn = playsound_strict(loadtempsound((("SFX\SCP\294\Retch" + (Str rand($00, $01))) + ".ogg")), $01, $00)
                XZ0260X8X2\Field66 = (millisecs() + $32)
            EndIf
        EndIf
        If (((XZ0260X8X2\Field66 > millisecs()) And (XZ0260X8X2\Field66 <> $00)) <> 0) Then
            TDD0Z6BXB6\Field14 = (TDD0Z6BXB6\Field14 + 1.0)
        Else
            XZ0260X8X2\Field66 = $00
        EndIf
    ElseIf (0.0 > XZ0260X8X2\Field82) Then
        XZ0260X8X2\Field82 = (XZ0260X8X2\Field82 - local2)
        If (-5.0 < XZ0260X8X2\Field82) Then
            If ((millisec Mod $190) < $32) Then
                XZ0260X8X2\Field1 = 4.0
            EndIf
            TDD0Z6BXB6\Field13 = 0.0
            makemeunplayable($01)
        Else
            XZ0260X8X2\Field38 = $02
        EndIf
        If (XZ0260X8X2\Field37 = $00) Then
            XZ0260X8X2\Field64 = 2800.0
            snd_i\Field8 = loadsound_strict("SFX\SCP\294\Vomit.ogg")
            GUESSEDupdateplayannouncement("SFX\SCP\294\Vomit.ogg", $01, TXXF6F02DB2[GUESSEDupdatedropitem()], 10.0, 1.0, 0.0, 0.0, 0.0)
            vomitchn = playsound_strict(snd_i\Field8, $01, $00)
            XZ0260X8X2\Field20 = XZ0260X8X2\Field11
            XZ0260X8X2\Field73 = XZ0260X8X2\Field39
            If (XZ0260X8X2\Field25 = $00) Then
                setcrouch($01)
            EndIf
            XZ0260X8X2\Field70 = 630.0
            If (-200.0 > XZ0260X8X2\Field42) Then
                XZ0260X8X2\Field11 = 1.5
                XZ0260X8X2\Field39 = 70.0
            Else
                XZ0260X8X2\Field11 = 0.0
                XZ0260X8X2\Field39 = 0.0
            EndIf
            local1 = createpivot($00)
            positionentity(local1, entityx(camera, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.05), entityz(camera, $00, 1.0), $00)
            turnentity(local1, 90.0, 0.0, 0.0, $00)
            entitypick(local1, 0.3)
            local0 = createdecal($05, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, 180.0, 0.0, 0.001, 1.0, $00, $01, $00, rand($C8, $FF), $00)
            local0\Field14 = 0.001
            local0\Field3 = 0.6
            local0\Field5 = -0.0002
            entityparent(local0\Field0, playerroom\Field15, $01)
            freeentity(local1)
            local1 = $00
            XZ0260X8X2\Field37 = $01
        EndIf
        TDD0Z6BXB6\Field14 = (TDD0Z6BXB6\Field14 + max(((XZ0260X8X2\Field82 / 10.0) + 1.0), 0.0))
        If (-15.0 > XZ0260X8X2\Field82) Then
            freesound_strict(snd_i\Field8)
            snd_i\Field8 = $00
            XZ0260X8X2\Field82 = 0.0
            If (0.0 = XZ0260X8X2\Field48) Then
                playsound_strict(TFB8222B2X($00, $00), $01, $00)
            EndIf
            XZ0260X8X2\Field11 = XZ0260X8X2\Field20
            XZ0260X8X2\Field39 = XZ0260X8X2\Field73
            XZ0260X8X2\Field37 = $00
        EndIf
    EndIf
    catcherrors("Uncaught: UpdateVomit()")
    Return $00
End Function
