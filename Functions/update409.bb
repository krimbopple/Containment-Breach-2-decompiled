Function update409%()
    Local local0#
    If (0.0 < i_409\Field0) Then
        local0 = i_409\Field0
        If (entityhidden(X2Z260BF0Z\Field1[$07]) <> 0) Then
            showentity(X2Z260BF0Z\Field1[$07])
        EndIf
        If (25200.0 > i_427\Field1) Then
            If (i_409\Field1 <> 0) Then
                i_409\Field0 = max((i_409\Field0 - (fps\Field3[$00] * 0.02)), 0.0)
            ElseIf (i_427\Field2 = $00) Then
                i_409\Field0 = min((i_409\Field0 + (fps\Field3[$00] * 0.005)), 100.0)
                XZ0260X8X2\Field64 = max(((i_409\Field0 * 3.0) * (2.0 - XZ0260X8X2\Field46)), XZ0260X8X2\Field64)
            EndIf
        EndIf
        entityalpha(X2Z260BF0Z\Field1[$07], min((((i_409\Field0 * 0.2) * (i_409\Field0 * 0.2)) / 1000.0), 0.5))
        If (i_409\Field1 <> 0) Then
            If (((35.0 >= i_409\Field0) And (35.0 < local0)) <> 0) Then
                createmsg(getlocalstring("msg", "409legs_1"), 6.0)
            ElseIf (((55.0 >= i_409\Field0) And (55.0 < local0)) <> 0) Then
                createmsg(getlocalstring("msg", "409abdomen_1"), 6.0)
            ElseIf (((70.0 >= i_409\Field0) And (70.0 < local0)) <> 0) Then
                createmsg(getlocalstring("msg", "409arms_1"), 6.0)
            ElseIf (((85.0 >= i_409\Field0) And (85.0 < local0)) <> 0) Then
                createmsg(getlocalstring("msg", "409head_1"), 6.0)
            EndIf
        ElseIf (((35.0 < i_409\Field0) And (35.0 >= local0)) <> 0) Then
            createmsg(getlocalstring("msg", "409legs_2"), 6.0)
            playsound_strict(loadtempsound("SFX\SCP\409\Crackling0.ogg"), $00, $00)
        ElseIf (((55.0 < i_409\Field0) And (55.0 >= local0)) <> 0) Then
            createmsg(getlocalstring("msg", "409abdomen_2"), 6.0)
            playsound_strict(loadtempsound("SFX\SCP\409\Crackling0.ogg"), $00, $00)
        ElseIf (((70.0 < i_409\Field0) And (70.0 >= local0)) <> 0) Then
            createmsg(getlocalstring("msg", "409arms_2"), 6.0)
            playsound_strict(loadtempsound("SFX\SCP\409\Crackling0.ogg"), $00, $00)
        ElseIf (((85.0 < i_409\Field0) And (85.0 >= local0)) <> 0) Then
            createmsg(getlocalstring("msg", "409head_2"), 6.0)
            playsound_strict(loadtempsound("SFX\SCP\409\Crackling1.ogg"), $00, $00)
        ElseIf (((93.0 < i_409\Field0) And (93.0 >= local0)) <> 0) Then
            If (i_409\Field1 = $00) Then
                playsound_strict(snd_i\Field50[$0D], $01, $00)
                XZ0260X8X2\Field11 = max(XZ0260X8X2\Field11, 2.0)
            EndIf
        ElseIf (94.0 < i_409\Field0) Then
            i_409\Field0 = min((i_409\Field0 + (fps\Field3[$00] * 0.004)), 100.0)
            If (chs\Field0 = $00) Then
                makemeunplayable($00)
            EndIf
            XZ0260X8X2\Field64 = 4.0
            XZ0260X8X2\Field1 = 3.0
        EndIf
        If (35.0 <= i_409\Field0) Then
            XZ0260X8X2\Field65 = 1.2
            XZ0260X8X2\Field34 = 1.0
            XZ0260X8X2\Field6 = 60.0
            XZ0260X8X2\Field56 = curvevalue(min(XZ0260X8X2\Field6, XZ0260X8X2\Field56), XZ0260X8X2\Field56, 20.0)
            If (96.92 <= i_409\Field0) Then
                msg\Field8 = format(getlocalstring("death", "409"), subjectname, "%s")
                kill($01, $01, $00, $01)
            EndIf
        EndIf
    Else
        i_409\Field1 = $00
        If (entityhidden(X2Z260BF0Z\Field1[$07]) = $00) Then
            hideentity(X2Z260BF0Z\Field1[$07])
        EndIf
    EndIf
    Return $00
End Function
