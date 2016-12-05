git config --global user.name "shanedrgn"
git config --global user.email "shanedrgn@gmail.com"
git add *
for /f "skip=1" %%x in ('wmic os get localdatetime') do if not defined MyDate set MyDate=%%x
set today=%MyDate:~0,4%-%MyDate:~4,2%-%MyDate:~6,2%
git commit -m %today%
git push
echo %today%
echo !%today%!
