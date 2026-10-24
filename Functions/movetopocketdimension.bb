Function movetopocketdimension%()
    Local local0.rooms
    Local local1.events
    For local0 = Each rooms
        If (local0\Field22\Field21 = $6F) Then
            n_i\Field2\Field65 = rnd(22000.0, 27000.0)
            n_i\Field2\Field66 = 0.0
            XZ0260X8X2\Field53 = -10.0
            XZ0260X8X2\Field52 = 0.0
            XZ0260X8X2\Field16 = 0.0
            XZ0260X8X2\Field38 = $02
            XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 0.5)
            XZ0260X8X2\Field64 = 1750.0
            hideentity(XZ0260X8X2\Field28)
            showentity(XZ0260X8X2\Field74)
            playsound_strict(loadtempsound("SFX\SCP\914\PlayerUse.ogg"), $00, $00)
            playsound_strict(loadtempsound("SFX\Room\PocketDimension\Enter.ogg"), $00, $00)
            teleporttoroom(local0)
            teleportentity(XZ0260X8X2\Field74, entityx(local0\Field15, $00, 1.0), (entityy(local0\Field15, $00, 1.0) + 2.0), entityz(local0\Field15, $00, 1.0), 0.3, $00, 2.0, $00)
            For local1 = Each events
                If (local0 = local1\Field19) Then
                    local1\Field7 = 0.0
                    Exit
                EndIf
            Next
            Return $00
            Exit
        EndIf
    Next
    Return $00
End Function
