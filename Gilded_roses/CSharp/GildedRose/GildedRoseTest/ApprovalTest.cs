using System;
using System.IO;
using System.Text;
using NUnit.Framework;
using ApprovalTests;
using ApprovalTests.Reporters;
using GildedRoseBusiness;

namespace GildedRoseTests
{
	[TestFixture]
	[UseReporter(typeof(NUnitReporter))]
	public class ApprovalTest
	{
		[Test]
		public void ThirtyDays()
		{
			StringBuilder fakeoutput = new StringBuilder();
			Console.SetOut(new StringWriter(fakeoutput));
			Console.SetIn(new StringReader("a\n"));

			Program.Main(new string[] { });
			String output = fakeoutput.ToString();
			Approvals.Verify(output);
		}
	}
	
}