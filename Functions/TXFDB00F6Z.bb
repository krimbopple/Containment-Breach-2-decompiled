Function TXFDB00F6Z%()
    Local local0.T20BFZFZ62X
    Local local1%
    Local local2%
    Local local3#
    Local local4%
    local1 = $00
    local2 = $00
    local3 = 1.0
    For local0 = Each T20BFZFZ62X
        If (entityhidden(local0\Field19) = $00) Then
            hideentity(local0\Field19)
        EndIf
        local0\Field1 = (local0\Field1 - fps\Field3[$01])
        If (FZBZD8282(local0) <= ((TXB2BFFFFFX() = $00) * $FFFFC568)) Then
            T2264ZDD6F(local0)
        Else
            If (((TXXF6F02DB2[local0\Field17] <> Null) And (TXXF6F02DB2[local0\Field17]\Field41 = $00)) <> 0) Then
                local0\Field17 = $00
            EndIf
            If (3600.0 > entitydistancesquared(local0\Field19, XZ0260X8X2\Field74)) Then
                If (entityhidden(local0\Field19) <> 0) Then
                    showentity(local0\Field19)
                EndIf
                local2 = ((local0\Field17 = TXXDZB2ZBXX()) And (0.0 < FD020X0BZ\Field2))
                local3 = (TD242DBB22(local0\Field5, FZBZD8282(local0)) * (Float (local2 = $00)))
                If (((((((0.0 >= local0\Field1) And (0.8 > entitydistancesquared(local0\Field4, XZ0260X8X2\Field74))) And (local1 = $00)) And (TX4F400F244 = Null)) And (local0\Field7 = $00)) And entityvisible(local0\Field4, camera, 0.0)) <> 0) Then
                    handentity = local0\Field4
                    If ((XZ0260X8X2\Field3 And ((((((((((Int XZ0260X8X2\Field48) Lor invopen) Lor (otheropen <> Null)) Lor (selecteditem <> Null)) Lor (closestitem <> Null)) Lor menuopen) Lor (d_i\Field3 <> Null)) Lor (d_i\Field6 <> Null)) Lor (1.0 <= entitydistancesquared(local0\Field4, XZ0260X8X2\Field74))) = $00)) <> 0) Then
                        TX4F400F244 = local0
                        TX4F400F244\Field14 = 0.0
                        playsound_strict(snd_i\Field46[$02], $00, $00)
                    EndIf
                    local1 = $01
                EndIf
                If (local0\Field18 > $00) Then
                    For local4 = $00 To $09 Step $01
                        If (local0\Field20[local4] <> $00) Then
                            entityalpha(local0\Field20[local4], local3)
                        EndIf
                    Next
                EndIf
                entityalpha(local0\Field19, local3)
            EndIf
        EndIf
    Next
    If (((TX4F400F244 <> Null) And ((((((((Int XZ0260X8X2\Field48) Lor invopen) Lor (otheropen <> Null)) Lor (selecteditem <> Null)) Lor menuopen) Lor (d_i\Field3 <> Null)) Lor (d_i\Field6 <> Null)) Lor (1.0 <= entitydistancesquared(TX4F400F244\Field4, XZ0260X8X2\Field74)))) <> 0) Then
        TX4F400F244 = Null
    EndIf
    If ((local1 And (((closestitem <> Null) Lor (d_i\Field3 <> Null)) Lor (d_i\Field6 <> Null))) <> 0) Then
        handentity = $00
    EndIf
    If (TX4F400F244 <> Null) Then
        TX4F400F244\Field14 = (TX4F400F244\Field14 + (fps\Field3[$00] / 2.0))
        If (100.0 <= TX4F400F244\Field14) Then
            TX6B2DZFFBF(TX4F400F244)
            TX4F400F244\Field1 = 35.0
            TX4F400F244 = Null
        ElseIf ((TDD0Z6BXB6\Field12 Lor TX4F400F244\Field7) <> 0) Then
            TX4F400F244 = Null
        EndIf
    EndIf
    Return $00
End Function
