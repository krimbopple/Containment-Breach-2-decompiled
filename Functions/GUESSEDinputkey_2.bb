Function GUESSEDinputkey_2%()
    Local local0%
    If (GUESSEDsetglobal_17() = $00) Then
        Return $00
    EndIf
    If (GUESSEDgetbank() <> $00) Then
        If (GUESSEDupdateanimatenpc() <> 0) Then
            GUESSEDisentity_5(TXXF6F02DB2[GUESSEDupdatedropitem()], 180.0, GUESSEDgetbank(), (TXDFXDZXXDD\Field2 * T484F2XDF\Field6))
        Else
            GUESSEDbankfunc(GUESSEDinitinitnewgame_8(), GUESSEDgetglobal_19(), GUESSEDupdatedropitem(), GUESSEDgetbank(), T484F2XDF\Field6, $00)
        EndIf
    EndIf
    If (((((T484F2XDF\Field4 = $00) And (ZFF8X2F22 = $00)) And keyhit(key\Field17)) And (TXDFXDZXXDD\Field2 > $00)) <> 0) Then
        playsound_strict(snd_i\Field39, $00, $00)
    EndIf
    T484F2XDF\Field6 = $00
    If ((((T484F2XDF\Field4 = $00) And (ZFF8X2F22 = $00)) And ((keydown(key\Field9) Lor keydown(key\Field17)) Lor (opt\Field80 And (0.3 < GUESSEDcreatebank_4(T484F2XDF\Field8))))) <> 0) Then
        T484F2XDF\Field3 = (GUESSEDupdateitems_2() + $FA)
        T484F2XDF\Field6 = (keydown(key\Field17) And (TXDFXDZXXDD\Field2 > $00))
    EndIf
    local0 = (T484F2XDF\Field3 > GUESSEDupdateitems_2())
    GUESSEDsetglobal_6(local0)
    Return $00
End Function
