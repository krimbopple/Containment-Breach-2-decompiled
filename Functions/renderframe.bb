Function renderframe%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5%, arg6%, arg7%)
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Select arg7
        Case $00
            If (arg6 <> 0) Then
                local1 = menugray
            Else
                local1 = menuwhite
            EndIf
            rendertiledimagerect(local1, arg4, arg5, $200, $200, arg0, arg1, arg2, arg3)
            rendertiledimagerect(menublack, arg4, arg5, $200, $200, (Int ((3.0 * menuscale) + (Float arg0))), (Int ((3.0 * menuscale) + (Float arg1))), (Int ((Float arg2) - (6.0 * menuscale))), (Int ((Float arg3) - (6.0 * menuscale))))
        Case $01
            local2 = colorred()
            local3 = colorgreen()
            local4 = colorblue()
            local5 = coloralpha()
            color($C8, $C8, $C8, $FF)
            rect(arg0, arg1, arg2, arg3, $01)
            color($10, $10, $10, $FF)
            rect((Int (max((1.0 * menuscale), 1.0) + (Float arg0))), (Int (max((1.0 * menuscale), 1.0) + (Float arg1))), (Int ((Float arg2) - max((2.0 * menuscale), 2.0))), (Int ((Float arg3) - max((2.0 * menuscale), 2.0))), $01)
            color(local2, local3, local4, local5)
        Case $02
            local2 = colorred()
            local3 = colorgreen()
            local4 = colorblue()
            local5 = coloralpha()
            color($1E, $1E, $1E, $FF)
            resizeimage(TX4D0Z2BB, arg2, arg3)
            drawimage(TX4D0Z2BB, arg0, arg1, $01)
            color(local2, local3, local4, local5)
    End Select
    Return $00
End Function
