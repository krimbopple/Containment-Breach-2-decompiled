Function update1048aears%()
    Local local0#
    If (0.0 < i_1048a\Field2) Then
        local0 = i_1048a\Field2
        If (25200.0 > i_427\Field1) Then
            If (i_1048a\Field1 <> 0) Then
                i_1048a\Field2 = max((i_1048a\Field2 - (fps\Field3[$00] / 2.0)), 0.0)
            Else
                cansave = $00
                If (i_427\Field2 = $00) Then
                    i_1048a\Field2 = min((i_1048a\Field2 + fps\Field3[$00]), 1100.0)
                    XZ0260X8X2\Field64 = (i_1048a\Field2 * 2.0)
                EndIf
            EndIf
        EndIf
        If (i_1048a\Field1 <> 0) Then
            If (((250.0 >= i_1048a\Field2) And (250.0 < local0)) <> 0) Then
                createmsg(getlocalstring("msg", "better_1"), 6.0)
            ElseIf (((600.0 >= i_1048a\Field2) And (600.0 < local0)) <> 0) Then
                createmsg(getlocalstring("msg", "1048a_rev1"), 6.0)
            EndIf
        ElseIf (((250.0 < i_1048a\Field2) And (250.0 >= local0)) <> 0) Then
            Select rand($03, $01)
                Case $01
                    createmsg(getlocalstring("msg", "1048a_2"), 6.0)
                Case $02
                    createmsg(getlocalstring("msg", "1048a_3"), 6.0)
                Case $03
                    createmsg(getlocalstring("msg", "1048a_4"), 6.0)
            End Select
        ElseIf (((600.0 < i_1048a\Field2) And (600.0 >= local0)) <> 0) Then
            Select rand($04, $01)
                Case $01
                    createmsg(getlocalstring("msg", "1048a_5"), 6.0)
                Case $02
                    createmsg(getlocalstring("msg", "1048a_6"), 6.0)
                Case $03
                    createmsg(getlocalstring("msg", "1048a_7"), 6.0)
                Case $04
                    createmsg(getlocalstring("msg", "1048a_8"), 6.0)
            End Select
        EndIf
        If (1050.0 < i_1048a\Field2) Then
            msg\Field8 = getlocalstring("death", "1048a")
            kill($00, $01, $00, $01)
        EndIf
    Else
        i_1048a\Field1 = $00
    EndIf
    Return $00
End Function
