Function refillcup%()
    Local local0.props
    Local local1.items
    Local local2%
    BXZDBZ0BB\Field5 = (BXZDBZ0BB\Field5 - fps\Field3[$00])
    If (0.0 >= BXZDBZ0BB\Field5) Then
        XZ0260X8X2\Field17 = Null
        For local0 = Each props
            If (((local0\Field4 And (playerroom = local0\Field5)) And ((0.64 > entitydistancesquared(local0\Field0, XZ0260X8X2\Field74)) And (entitypick(camera, 0.8) = local0\Field0))) <> 0) Then
                XZ0260X8X2\Field17 = local0
                Exit
            EndIf
        Next
        BXZDBZ0BB\Field5 = 35.0
    EndIf
    If (XZ0260X8X2\Field17 <> Null) Then
        If (interactobject(XZ0260X8X2\Field17\Field0, 0.8, $00) <> 0) Then
            local1 = Null
            For local2 = $00 To (maxitemamount - $01) Step $01
                If (TX60DB8XBBZ(local2) <> Null) Then
                    If (TX60DB8XBBZ(local2)\Field6\Field9 = $2C) Then
                        local1 = TX60DB8XBBZ(local2)
                        Exit
                    EndIf
                EndIf
            Next
            If (local1 <> Null) Then
                removeitem(local1, $01)
                local1 = createitem("Cup", $2B, 0.0, 0.0, 0.0, $C8, $C8, $C8, 0.2, $00)
                local1\Field19 = "WATER"
                local1\Field24 = format(getlocalstring("items", "cupof"), getlocalstring("misc", "water"), "%s")
                entitytype(local1\Field9, $03, $00)
                pickitem(local1, $01)
                playsound_strict(loadtempsound("SFX\SCP\294\Dispense1.ogg"), $00, $00)
                X42666Z0B0(Null, "SFX\SCP\294\Dispense1.ogg", XZ0260X8X2\Field17\Field0, 8.0, 1.0)
                createmsg(getlocalstring("msg", "refill"), 6.0)
            Else
                createmsg(getlocalstring("msg", "cup.needed"), 6.0)
            EndIf
            Return $00
        EndIf
    EndIf
    Return $00
End Function
