Function kill%(arg0%, arg1%, arg2%, arg3%)
    Local local0%
    Local local1.decals
    Local local2%
    Local local3%
    local0 = (chs\Field0 And (arg2 = $00))
    If (CB64D8DZF <> Null) Then
        If (((CB64D8DZF\Field13 = GUESSEDupdatedropitem()) And local0) <> 0) Then
            Return $00
        EndIf
        GUESSEDcreateentity_13(CB64D8DZF, arg0, $00)
        If (CB64D8DZF\Field13 <> GUESSEDupdatedropitem()) Then
            Return $00
        EndIf
    Else
        If (local0 <> 0) Then
            Return $00
        EndIf
        If (0.0 = XZ0260X8X2\Field48) Then
            GUESSEDcreateentity_13(TXXF6F02DB2[GUESSEDupdatedropitem()], arg0, arg2)
        EndIf
    EndIf
    If (local0 <> 0) Then
        Return $00
    EndIf
    stopbreathsound()
    If (0.0 = XZ0260X8X2\Field48) Then
        If (arg0 <> 0) Then
            local2 = loadtexture_strict("GFX\Overlays\blood_overlay.png", $01, $00, 1.0)
            X2Z260BF0Z\Field1[$0C] = createsprite(arkblurcam)
            scalesprite(X2Z260BF0Z\Field1[$0C], 1.001, (graphicheightfloat / graphicwidthfloat))
            entitytexture(X2Z260BF0Z\Field1[$0C], local2, $00, $00)
            entityblend(X2Z260BF0Z\Field1[$0C], $02)
            entityfx(X2Z260BF0Z\Field1[$0C], $01)
            entityorder(X2Z260BF0Z\Field1[$0C], $FFFFFC15)
            moveentity(X2Z260BF0Z\Field1[$0C], 0.0, 0.0, 1.0, $00)
            deletesingletextureentryfromcache(local2, $00)
            local2 = $00
            If (GUESSEDupdatexdb() = $00) Then
                local3 = createpivot($00)
                positionentity(local3, (entityx(XZ0260X8X2\Field74, $00, 1.0) + rnd(-0.8, 0.8)), (entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.05), (entityz(XZ0260X8X2\Field74, $00, 1.0) + rnd(-0.8, 0.8)), $00)
                turnentity(local3, 90.0, 0.0, 0.0, $00)
                entitypick(local3, 0.3)
                local1 = createdecal($07, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, 0.1, 1.0, $00, $01, $00, $00, $00)
                local1\Field14 = (1.0 / 400.0)
                entityparent(local1\Field0, playerroom\Field15, $01)
                freeentity(local3)
                local3 = $00
            EndIf
        EndIf
        XZ0260X8X2\Field36 = rand($00, $01)
        XZ0260X8X2\Field21 = 0.0
        If (arg3 <> 0) Then
            playsound_strict(snd_i\Field50[$00], $00, $00)
        EndIf
        If (selecteddifficulty\Field1 >= $02) Then
            deletegame(currsave)
            gamesaved = $00
            loadsavedgames()
        EndIf
        showentity(XZ0260X8X2\Field28)
        positionentity(XZ0260X8X2\Field28, entityx(camera, $01, 1.0), entityy(camera, $01, 1.0), entityz(camera, $01, 1.0), $01)
        resetentity(XZ0260X8X2\Field28)
        rotateentity(XZ0260X8X2\Field28, 0.0, entityyaw(camera, $00, 1.0), 0.0, $00)
        XZ0260X8X2\Field48 = 1.0
        GUESSEDfreeentity_4(arg1)
    EndIf
    Return $00
End Function
