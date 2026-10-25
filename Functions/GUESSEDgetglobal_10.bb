Function GUESSEDgetglobal_10.TF2ZXX8FZ(arg0$, arg1#, arg2#, arg3%, arg4%, arg5%, arg6%, arg7#, arg8#, arg9#)
    If (instr(arg0, "://", $01) <> 0) Then
        Return GUESSEDcreatechannel_2(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8, arg9)
    EndIf
    Return GUESSEDplaychannel_3(GUESSEDsetmap_2(arg0), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
    Return Null
End Function
